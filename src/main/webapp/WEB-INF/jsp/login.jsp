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
</head>
<body>
	<div class="main">
		<div class="container">
			<div class="dev-inc-picture">
				<img src="resources/images/devincpicture.png" alt="incubating">
			</div>

			<div class="login-form">
				<c:url var="loginUrl" value="/login"/>
				<form action="${loginUrl}" method="post">
<%--					<c:if test="${param.error != null}">--%>
<%--						<div class="alert alert-danger">--%>
<%--							<p>Invalid username and password.</p>--%>
<%--						</div>--%>
<%--					</c:if>--%>
<%--					<c:if test="${param.logout != null}">--%>
<%--						<div class="alert alert-success">--%>
<%--							<p>You have been logged out successfully.</p>--%>
<%--						</div>--%>
<%--					</c:if>--%>
					<div>
						<input type="text" class="login-field" id="username" name="ssoId" placeholder="Логин" required>
					</div>
					<div>
						<input type="password" class="password-field" id="password" name="password" placeholder="Пароль" required>
					</div>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<input type="submit" class="submit-button" value="Войти">
				</form>
			</div>
		</div>
	</div>
</body>
</html>
