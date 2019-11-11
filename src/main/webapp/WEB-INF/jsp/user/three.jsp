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
            <p>Вопрос</p>
            <p>
            <ol>
                <li>Ответ</li>
                <li>Ответ</li>
                <li>Ответ</li>
                <li>Ответ</li>
            </ol>
            </p>

            <input type="submit" class="submit-button" value="Отправить">
        </div>
    </div>
</div>
</body>
</html>