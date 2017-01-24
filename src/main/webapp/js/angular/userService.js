myApp.controller("springController", function springController($scope,$http,
		userService) {
	$scope.userList = [];
	$http({
		method : "GET",
		url : "/jpaproject/User/ListData"
	}).then(function success(response) {
		$scope.userList = response.data;
		console.log(response.data);
	});
	
	$scope.search = function() {
		console.log({name: $scope.name});
		$http({
			method : "GET",
			url : "/jpaproject/User/ListData/",
			params : {name: $scope.name}
		}).then(function success(response) {
			$scope.userList = response.data;
			console.log(response.data);
		});
		
	};
}).factory("userService", function() {
	console.log("userService");



	return function() {

	};
});