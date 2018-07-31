<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="../../jsInit.jsp"%><!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>產品管理</title>
<style type="text/css">
.button {
	padding: 3px 3px 2px 2px;
	border-radius: 15px;
}
</style>
<link rel="stylesheet" href="css/main.css" type="text/css">
</head>
<body>
	<div>
		<a href="toDetail.jsp?up_id=${up_id}" class="button">新增</a>
	</div>
	<div>
		<table>
			<tr>
				<th>ID</th>
				<th>圖標</th>
				<th>名稱</th>
				<th>操作</th>
			</tr>
			<s:iterator value="product_list">
				<tr>
					<td>${id}</td>
					<td>${name}</td>
					<td>${price}</td>
					<td>${content}</td>
					<td><a href="toDetail.jsp?product_id=${id}" class="button">修改</a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>