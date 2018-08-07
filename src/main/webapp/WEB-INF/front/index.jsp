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
	<div id="header" class="container-fluid"></div>
	<div class="row" style="height: 1000px">
		<div class="col-md-3"
			style="width: 20%; background-color: gray; height: 100%;"
			class="rounded">
			<h3>分類</h3>
			<div class="row">
				<s:iterator value="cg_list">
					<div class="col-md-1">
						<i class='fa fa-${icon}'></i>
					</div>
				</s:iterator>
			</div>
		</div>
		<div class="col-md-9"></div>
	</div>
</body>
</html>