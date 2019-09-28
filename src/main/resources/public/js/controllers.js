angular.module('app.controllers', []).controller('AccountListController', function($scope, $state, popupService, $window, Account) {
  $scope.accounts = Account.query(); //fetch all account. Issues a GET to /api/v1/account

  $scope.deleteAccount = function(Account) { // Delete a Account. Issues a DELETE to /api/v1/account/:id
    if (popupService.showPopup('Really delete this?')) {
      Account.$delete(function() {
        $scope.accounts = Account.query();
        $state.go('account');
      });
    }
  };
}).controller('AccountViewController', function($scope, $stateParams, Account) {
  $scope.account = Account.get({ id: $stateParams.id }); //Get a single account.Issues a GET to /api/v1/accounts/:id
}).controller('AccountCreateController', function($scope, $state, $stateParams, Account) {
  $scope.account = new Shipwreck();  //create new shipwreck instance. Properties will be set via ng-model on UI

  $scope.addAccount = function() { //create a new shipwreck. Issues a POST to /api/v1/account
    $scope.account.$save(function() {
      $state.go('account'); // on success go back to the list i.e. account state.
    });
  };
}).controller('AccountEditController', function($scope, $state, $stateParams, Account) {
  $scope.updateAccount = function() { //Update the edited shipwreck. Issues a PUT to /api/v1/accounts/:id
    $scope.account.$update(function() {
      $state.go('account'); // on success go back to the list i.e. account state.
    });
  };

  $scope.loadAccount = function() { //Issues a GET request to /api/v1/accounts/:id to get a accounts to update
    $scope.accounts = Account.get({ id: $stateParams.id });
  };

  $scope.loadAccounts(); // Load a accounts which can be edited on UI
});
