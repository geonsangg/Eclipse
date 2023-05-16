<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다운로드 요청창</title>
</head>
<body>
	<form action="download.jsp" method="get">
		<input type="hidden" name="img1" value="cat.png">
		<input type="hidden" name="img2" value="dog.png">
		<input type="submit" value="이미지 다운로드">
	</form>
</body>
</html>