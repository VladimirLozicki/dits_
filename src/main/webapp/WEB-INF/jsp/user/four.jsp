<%--
  Created by IntelliJ IDEA.
  User: vladimirlozickiy
  Date: 2019-11-16
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <style>
        <%@include file='../css/login_style.css' %>
    </style>
</head>
<body>
<div class="a">
    <strong>${user}</strong>
    <a href="<c:url value="/logout" />">Выйти</a>
</div>

<div class="main">
    <div class="container">
        <div class="dev-inc-picture">
            <img src="resources/images/devincpicture.png" alt="incubating">
        </div>
        <div class="login-form">
            <p>${question}</p>
            <p>
                <c:forEach items="${answers}" var="item">
            <div>${item.description}</div>
            </c:forEach>
            </p>
            <input type="submit" class="submit-button" value="Отправить">
        </div>
    </div>
</div>
</body>
</html>
