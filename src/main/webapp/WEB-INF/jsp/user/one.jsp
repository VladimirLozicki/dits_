<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%--
  Created by IntelliJ IDEA.
  User: vladimirlozickiy
  Date: 2019-10-09
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <style>
        <%@include file='../css/login_style.css' %>
    </style>
</head>
<body>

<div class="a">
    <strong>${user}</strong>
    <a href="<c:url value="/logout" />">выйти</a>
</div>

<div class="main">
    <div class="container">
        <div class="dev-inc-picture">
            <img src="resources/images/devincpicture.png" alt="incubating">
        </div>
        <div class="login-form">
            <div><a href="<c:url value="/chooseTopic" />">Выбор темы и теста</a></div>
            <div><a href="<c:url value="/statistics" />">Личная статистика</a></div>
        </div>
    </div>
</div>

</body>

</html>