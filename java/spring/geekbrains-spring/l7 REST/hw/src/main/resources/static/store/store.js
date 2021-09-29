angular.module('app').controller('storeController', function ($scope, $http) {
    const contextPath = 'http://localhost:8596/hw';

    $scope.generatePageIndexes = function(startPage, endPage) {
        let arr = [];
        for (let i = startPage; i < endPage + 1; i++) {
            arr.push(i);
        }
        return arr;
    };

    $scope.fillTable = function (pInd = 1) {
        $http({
            url: contextPath + '/api/v1/products',
            method: "GET",
            params: {
                max_price: $scope.filterProduct ? $scope.filterProduct.max_price : null,
                min_price: $scope.filterProduct ? $scope.filterProduct.min_price : null,
                title: $scope.filterProduct ? $scope.filterProduct.title : null,
                p: pInd
            }
        }).then(function (response) {
            console.log(response.data)
            $scope.Products = response.data;
            $scope.PaginationArr = $scope.generatePageIndexes(1, $scope.Products.totalPages);
        });
    }

    $scope.submitCreateNewProduct = function () {
        $http.post(contextPath + '/api/v1/products', $scope.newProduct)
            .then(function (response) {
                // $scope.Products.push(response.data);
                $scope.newProduct = null;
                $scope.fillTable();
            });
    };

    $scope.fillTable();
});