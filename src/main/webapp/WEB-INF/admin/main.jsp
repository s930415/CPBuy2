<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>後台系統</title>
</head>
<frameset id="top" rows="55,23,*,23" framespacing="0" border="0">
	<frame id="bannerFrame" name="bannerFrame" src="toBanner" />
	<frame id="middleFrame" name="middleFrame" src="toHeader" />
	<frameset id="bottom" cols="180,*" framespacing="0" border="0"
		frameborder="no">
		<frame id="menuFrame" name="menuFrame" src="toMenu" />
		<frame id="contentFrame" name="contentFrame" src="toContent" />
	</frameset>
	<frame id="footerFrame" name="footerFrame" src="toFooter" />
	<noframes>
		<body>
			<p>此網頁使用框架</p>
		</body>
	</noframes>
</frameset>
</html>