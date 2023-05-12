<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 출력창</title>
</head>
<body>
	<h2 align="center">회원 정보</h2>
	<table border="1" align="center" width="700">
		<tr align="center" bgcolor="lightgreen">
			<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th>
		</tr>
		<tr align="center">
			<td>${memberList[0].id}</td>
			<td>${memberList[0].pwd}</td>
			<td>${memberList[0].name}</td>
			<td>${memberList[0].email}</td>	
		</tr>
		<tr align="center">
			<td>${memberList[1].id}</td>
			<td>${memberList[1].pwd}</td>
			<td>${memberList[1].name}</td>
			<td>${memberList[1].email}</td>	
		</tr>
	</table>
</body>
</html>