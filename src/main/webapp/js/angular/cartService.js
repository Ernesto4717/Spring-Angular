myApp.controller("cartController",function cartController($scope,cartService,$http){
	
	$scope.cartList = [];
	$http({
		method : "GET",
		url : "/jpaproject/Cart/ListData"
	}).then(function success(response) {
		$scope.cartList = response.data;
		console.log(response.data);
	});
	
});
myApp.factory("cartService",function(){
	console.log("cartService");
	return function(){
		
	};
});