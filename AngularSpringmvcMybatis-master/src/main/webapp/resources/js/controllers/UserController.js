'use strict';
/**
 * UserController
 */
var UserController = function($scope, $http) {
    $scope.fetchUsersList = function() {
        $http.get('users/userlist.json').success(function(userList){
            $scope.users = userList;
        });
        
/*    	$http.get('users/userlist.json').success(function(userList){
			angular.forEach(userList,function(user){
				$scope.user.userId = user.userId;
				$scope.user.userName = user.userName;
				
				console.log("log:" + user.userId);
				console.log("log:" + user.userName);
			});
		});*/
    };

    $scope.addNewUser = function(newUser) {
        $http.post('users/addUser/' + newUser).success(function() {
            $scope.fetchUsersList();
            $scope.userName = 'update success';
        });
       
    };

    $scope.removeUser = function(user) {
        $http.delete('users/removeUser/' + user).success(function() {
            $scope.fetchUsersList();
        });
    };

    $scope.removeAllUsers = function() {
        $http.delete('users/removeAllUsers').success(function() {
            $scope.fetchUsersList();
        });

    };

    $scope.fetchUsersList();
};