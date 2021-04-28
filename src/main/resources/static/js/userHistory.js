var app = angular.module('userHistory', []);

app.controller("UserHistoryController", function ($scope, $http) {

    //Get func
    $scope.getUserHistory = function () {
        $http.get('/public/rest/userHistory').then($scope.successGetUserHistoryCallback, $scope.errorCallback);
    };

    $scope.successGetUserHistoryCallback = function (response) {
        $scope.userHistoryList = response.data;
    };

    //Post func
    $scope.addUserHistory = function (answer) {
        $http.post('/public/rest/userHistory/' + answer).then($scope.successAddUserHistoryCallback, $scope.errorCallback);
    };

    $scope.successAddUserHistoryCallback = function (response) {
        $http.get('/public/rest/userHistory/').then($scope.successGetUserHistoryCallback, $scope.errorCallback);
    };

    //Error callback
    $scope.errorCallback = function (error) {
        console.log(error);
    };
});