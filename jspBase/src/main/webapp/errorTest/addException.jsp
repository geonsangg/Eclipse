<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 페이지</title>
</head>
<body>
	<h2>애러 내용(에러원인과 입력자료)</h2>
	<h3><%= exception.toString() %></h3>
	<h2>애러 내용(입력자료)</h2>
	<h3><%= exception.getMessage() %></h3>
	<h2>애러는 콘솔로 보여주고 사용자에게는 알 수 있게 표현</h2>
	<% exception.printStackTrace(); %>
	<h3>숫자만 입력가능합니다. 다시 시도해보세요.=><a href="adder.html">다시 입력하기</a></h3>
</body>
</html>