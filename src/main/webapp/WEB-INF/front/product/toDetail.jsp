<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewpoint"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>分類管理</title>
</head>
<body>
	<div>
		<s:form id="baseForm" action="category/doAlert">
			<tr>
				<td><s:textfield type="text" name="category.up_id" label="上層編號"
						value="%{category.up_id}"></s:textfield></td>
			</tr>
			<s:if test="category.id != null">
				<tr>
					<td><s:textfield value="%{category.id}" label="編號"
							readonly="true"></s:textfield></td>
				</tr>
			</s:if>
			<tr>
				<td><s:textfield name="category.name" value="%{category.name}"
						label="名稱"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="category.show" value="%{category.show}"
						label="顯示"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="category.sort" value="%{category.sort}"
						label="排序"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="category.icon" value="%{category.icon}"
						label="標籤"></s:textfield></td>
			</tr>
			<s:if test="category.id != null">
				<s:hidden name="category.id" value="%{category.id}"></s:hidden>
				<s:submit value="修改"></s:submit>
			</s:if>
			<s:else>
				<s:submit value="新增"></s:submit>
			</s:else>
		</s:form>
	</div>
</body>
</html>