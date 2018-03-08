<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HELLO WORLD</title>
</head>
<body>
	<div class="middle">
		<div class="left">
			前台123
			<s:iterator value="cg_list">
				<tr>
					<td><i class='fa fa-${icon}'></i></td>
				</tr>
			</s:iterator>
		</div>
		<div class="right"></div>
	</div>
</body>
</html>