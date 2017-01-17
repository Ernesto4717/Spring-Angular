myApp.controller("homeController", function homeController($scope, $http) {

	console.log("controller user");
	$scope.userList=[];
	$scope.user=function() {
		console.log("function user");
		$http({
			method : "GET",
			url : "/jpaproject/User/List"
		}).then(function success(response){
			$scope.userList=response.data.users;
			console.log($scope.userList);
		});
	};

});
