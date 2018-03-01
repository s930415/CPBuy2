<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="../jsInit.jsp" %>
</head>
<body>
	<div>
		<form action="/cpman2/admin/login/doLogin.jsp" method="post">
			<table>
				<tr>
					<td><i class="fas fa-user"></i>帳號</td>
					<td><input type="text" name="account"></td>
				</tr>
				<tr>
					<td>密碼</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><a href="javascript(void);">註冊</a></td>
				</tr>
			</table>
			<input type="submit" value="登入">
		</form>
	</div>
</body>
</html>