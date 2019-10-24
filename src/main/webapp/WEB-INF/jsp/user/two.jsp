<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>



    <style type="text/css">
        .a {
            float: right;
        }

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
            margin-right: 450px;
        }

        .button {
            margin-top: 20px;
            width: 100px;
            height: 30px;
            background-color: skyblue;
        }
    </style>
</head>

<div class="a">
    <strong>${user}</strong>
    <a href="<c:url value="/logout" />">выйти</a>
</div>

<body>
<div id="left">
    <p>
        <image src="resources/images/dev.jpg" alt="picture don't download"></image>
    </p>
</div>

<div id="right">

    <p>
        <select>
            <option>Название теста</option>
            <option>OOP</option>
            <option>Patterns</option>
            <option>Java Core</option>
            <option>Collections</option>
            <option>HTML</option>
        </select>
    </p>

    <p>
        <select>
            <option>Название темы</option>
            <option>OOP</option>
            <option>Patterns</option>
            <option>Java Core</option>
            <option>Collections</option>
            <option>HTML</option>
        </select>
    </p>

    <div align="center">
        <input type="submit" class="button" value="Следуюшщий">
    </div>
</div>
</body>
</html>