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
    <a href="<c:url value="/logout" />">выйти</a>
</div>

<div class="main">
    <div class="container">
        <div class="dev-inc-picture">
            <img src="resources/images/devincpicture.png" alt="incubating">
        </div>
        <div class="login-form">
            <p><select>
                <option>Название теста</option>
                <option>OOP</option>
                <option>Patterns</option>
                <option>Java Core</option>
                <option>Collections</option>
                <option>HTML</option>
            </select></p>
            <p><select>
                <option>Название темы</option>
                <option>OOP</option>
                <option>Patterns</option>
                <option>Java Core</option>
                <option>Collections</option>
                <option>HTML</option>
            </select></p>
            <input type="submit" class="submit-button" value="Пройти тестирование">
            <form action="/two2" method="get">
                <input type="submit" value="three page">
            </form>
        </div>
    </div>
</div>
</body>
</html>