<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
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
                <div>
                    <select id="topic" name="topic">
                        <c:forEach items="${topic}" var="item">
                            <option>${item.name}</option>
                        </c:forEach></select>
                </div>


                <button type="button" value="start" id="start">getName</button>

            <form method="get" action="/map">
                <select id="tests" name="test">
                    <option>Выберите тест</option>
                    <c:forEach items="${test}" var="item">
                        <option>${item.name}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="Пройти тестирование">
            </form>

        </div>
    </div>
</div>
<script>
    $("#start").click(function () {
        $.ajax({
            url: "/two",
            type: "GET",
            data:  {"topic" : document.getElementById("topic").value},
            success: function (response) {
            }
        })
    });
</script>
</body>
</html>