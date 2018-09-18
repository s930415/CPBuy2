<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="../../jsInit.jsp"%><!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>產品列表</title>
<style type="text/css">
.buuton {
	padding: 3px 3px 2px 2px;
	border-radius: 15px;
}
</style>
</head>
<body>
	<div>
		<table>
			<tr>
				<th>ID</th>
				<th>名稱</th>
				<th>圖標</th>
				<th>內容</th>
			</tr>
			<s:iterator value="product_list">
				<tr>
					<td>${id}</td>
					<td>${name}</td>
					<td>${price}</td>
					<td>${content}</td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>