<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="/resources/js/angular.min.js" type="text/javascript" ></script>
    <script type="text/javascript">

        var app = angular.module("app", []);

        var ctrl = app.controller('formCtrl', function($scope) {

        });

    </script>
</head>
<body>
    <c:forEach var="field" items="${form.fields}">
        ${field.name} : <input type="text" ng-model="data.${field.viewModel}" ng-show="data.${field.ngShow}"/>
    </c:forEach>
</body>
</html>