<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Login</title>
	<meta charset="utf-8">
	<meta name="pageInfo" content="devincubator">
	<style>
		<%@include file='css/login_style.css' %>
	</style>
	<%--<link rel="stylesheet" href="<c:url value="/WEB-INF/jsp/css/login_style.css"/>" media="screen" type="text/css"/>--%>
</head>
<body>

	<header></header>

	<div class="main">
		<div class="container">
			<div class="dev-inc-picture">
				<img src="resources/images/devincpicture.png" alt="incubating">
			</div>
			<div class="login-form">
				<form name="login" action="login" method="post">
					<input class="login-field" type="text" name="login" placeholder="Логин"><br>
					<input class="password-field" type="password" name="password" placeholder="Пароль"><br>
					<input class="submit-button" type="submit" value="Войти">
				</form>
			</div>
		</div>
	</div>

	<footer></footer>
</body>
</html>