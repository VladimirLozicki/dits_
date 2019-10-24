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
            margin-top: 220px;
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
<body>
<div class="a">
    <strong>${user}</strong>
    <a href="<c:url value="/logout" />">Выйти</a>
</div>

<div id="left">
    <p>
        <image src="resources/images/dev.jpg" alt="picture don't download"></image>
    </p>
</div>
<div id="right">
    <p>Вопрос</p>
    <p>
    <ol>
        <li>Ответ</li>
        <li>Ответ </li>
        <li>Ответ</li>
        <li>Ответ</li>
    </ol>
    </p>

    <div align="center">
        <input type="submit" class="button" value="Отправить">
    </div>
</div>

</body>
</html>