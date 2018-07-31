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
	<div>
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
				<td><s:textfield name="product.show" value="%{product.show}"
						label="顯示"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="product.sort" value="%{product.sort}"
						label="排序"></s:textfield></td>
			</tr>
			<tr>
				<td>分類<a>+</a></td>
				<td><s:iterator var="category_list">
					</s:iterator></td>
			</tr>
			<tr>
				<s:file label="圖片" size="40" name="prodcut_img"></s:file>
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