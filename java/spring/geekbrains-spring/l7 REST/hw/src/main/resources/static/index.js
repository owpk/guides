(function () {
    'use strict';

    angular
        .module('app', ['ngRoute', 'ngStorage'])
        .config(config)
        .run();

    function config($routeProvider, $httpProvider) {
        $routeProvider
            .when('/store', {
                templateUrl: 'store/store2.html',
                controller: 'storeController'
            });
    }
})();
