<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>표현 언어로 여러가지 데이터 출력</h1>
	<h2>
		숫자갑 - ${200} <br>
		홍길동님 ${"안녕하세요"} <br>
		숫자끼리 연산 - ${20+30}<br>
		실수값 - ${5.3}<br>
		불린값 - ${true}<br>
		문자열(숫자)와 숫자의 연산 - ${"10"+1}<br> 
		null과 숫자의 연산 - ${null+10}<br>
		<%--문자와 숫자는 에러=${"안녕"+20}<br> --%>
	</h2>
</body>
</html>