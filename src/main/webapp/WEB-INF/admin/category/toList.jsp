<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="../../jsInit.jsp"%><!DOCTYPE>
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
			<s:iterator value="page_list">
				<tr>
					<td>${id}</td>
					<td><i class='fa fa-${icon}'></i></td></td>
					<td>${name}</td>
					<td>
						<a href="toDetail.jsp?cg_id=${id}" class="button">修改</a>
						<a href="toList.jsp?up_id=${id}" class="button">修改管理下層</a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>