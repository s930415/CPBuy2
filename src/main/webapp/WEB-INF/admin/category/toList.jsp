<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分類管理</title>
<style type="text/css">
.buuton {
	padding: 3px 3px 2px 2px;
	border-radius: 15px;
}
</style>
</head>
<body>
	<div>
		<a href="toDeatail.jsp" class="button">新增</a>
	</div>
	<div>
		<tr>
			<th>ID</th>
			<th>名稱</th>
		</tr>
		<s:iterator value="page_list">
			<tr>
				<td>${page_list.id}</td>
				<td>${page_list.name}</td>
			</tr>
		</s:iterator>
	</div>
</body>
</html>