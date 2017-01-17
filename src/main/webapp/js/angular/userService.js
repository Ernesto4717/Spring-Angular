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
	$scope.user = function() {
		console.log("function user");
		
	};
}).factory("userService", function() {
	console.log("userService");



	return function() {

	};
});