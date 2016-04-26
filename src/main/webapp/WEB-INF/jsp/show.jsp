<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="/resources/js/angular.min.js" type="text/javascript" ></script>
    <script type="text/javascript">

        var app = angular.module("app", []);

        var ctrl = app.controller('formCtrl', ['$scope', '$http', function($scope, $http) {
            $scope.data = {};
            $scope.send = function() {
                $http.post('${pageContext.request.contextPath}/send', $scope.data).then(function(response) {
                    console.log(response);
                }, function(response) {
                    alert("nie udalo sie");
                } );
            }
        }]);

    </script>
</head>
<body ng-app="app" ng-controller="formCtrl">
    <c:forEach var="field" items="${form.fields}">
        ${field.name} : <input type="text" ng-model="data.${field.viewModel}" ng-show="true"/>
    </c:forEach>
<button type="button" ng-click="send()" >Wyślij </button>
</body>
</html>