<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分類管理</title>
</head>
<body>
	<div>
		<s:form id="baseForm" action="doAlert">
			<tr>
				<td>上層編號</td>
				<td><input type="text" name="category.up_id"></td>
			</tr>
			<tr>
				<td>編號</td>
				<td><input type="text" name="category.id"></td>
			</tr>
			<tr>
				<td>名稱</td>
				<td><input type="text" name="category.name"></td>
			</tr>
			<tr>
				<td>顯示</td>
				<td><input type="text" name="category.show"></td>
			</tr>
			<tr>
				<td>排序</td>
				<td><input type="text" name="category.sort"></td>
			</tr>
		</s:form>
	</div>
</body>
</html>