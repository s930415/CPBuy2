<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewpoint"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>產品管理</title>
</head>
<body>
	<div class="row">
		<s:form id="baseForm" action="product/doAlert" method="POST"
			enctype="multipart/form-data">
			<s:if test="product.id != null">
				<tr>
					<td><s:textfield value="%{product.id}" label="編號"
							readonly="true"></s:textfield></td>
				</tr>
			</s:if>
			<tr>
				<td><s:textfield name="product.name" value="%{product.name}"
						label="名稱"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="product.price" value="%{product.price}"
						label="價錢"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textarea name="product.content"
						value="%{product.content}" label="內容" cols="40" rows="10" /></td>
			</tr>
			<tr>
				<td>分類<a>+</a></td>
				<td><s:iterator var="category_list">
					</s:iterator></td>
			</tr>
			<tr>
				<s:file label="圖片" size="40" name="product_img"></s:file>
			</tr>
			<s:if test="product.id != null">
				<s:hidden name="product.id" value="%{product.id}"></s:hidden>
				<s:submit value="修改"></s:submit>
			</s:if>
			<s:else>
				<s:submit value="新增"></s:submit>
			</s:else>
		</s:form>
	</div>
</body>
</html>