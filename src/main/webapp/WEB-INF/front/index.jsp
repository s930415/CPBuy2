<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HELLO WORLD</title>
<s:include value="../jsInit.jsp"></s:include>
</head>
<body>
	<div class="middle" style="height: 500px">
		<div class="left" style="width: 25%;background-color: gray;height: 100%;">
			<h3>分類</h3>
			<table style="width: 20%;">
				<s:iterator value="cg_list">
					<i class='fa fa-${icon}' style="margin: 5px"></i>
				</s:iterator>
			</table>
		</div>
		<div class="right"></div>
	</div>
</body>
</html>