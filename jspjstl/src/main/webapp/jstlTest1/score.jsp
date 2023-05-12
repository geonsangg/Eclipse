<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험점수 입력 창</title>
</head>
<body>
	<h2>시험점수를 입력해주세요</h2>
	<form action="result.jsp" method="get">
		이름 : <input type="text" name="name"><br>
		시험점수 : <input type="text" name="score"><br>
		<input type="submit" value="학점변환">
	</form>
</body>
</html>