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
    <style type="text/css">
        #left {
            float: left;
            width: 500px;
            height: 600px;
            margin-top: 50px;
            margin-left: 50px;
        }
        #right {
            float: right;
            margin-top: 250px;
            margin-right: 350px;
        }

        .a {
            float: right;
        }
    </style>
</head>

<body>
<div class="a">
    <strong>${user}</strong>
    <a href="<c:url value="/logout" />">Logout</a>
</div>
<div id="left">
    <p>
        <image src="resources/images/dev.jpg" alt="picture don't download"></image>
    </p>
</div>

<div id="right">
        <p><a href="">Выбор темы и статистика</a></p>
        <p><a href=#>Личная статистика</a></p>

    <form method="get" action="/two">
        <input type="submit" value="Выбор темы и статистика">
    </form>

</div>
</body>
</html>