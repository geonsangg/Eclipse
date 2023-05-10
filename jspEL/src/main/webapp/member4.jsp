<%@page import="java.time.LocalDate"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%
	request.setCharacterEncoding("utf-8");
%> 
<jsp:useBean id="memVo" class="jspEL.ex01.MemberVO"/>
<jsp:setProperty property="*" name="memVo"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 창</title>
</head>
<body>
	<h2 align="center">회원 정보</h2>
	<table border="1" align="center" width="700">
		<tr align="center" bgcolor="lightgreen">
			<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th>
		</tr>
		<tr align="center">
			<td><%= memVo.getId() %></td>
			<td><%= memVo.getPwd() %></td>
			<td><%= memVo.getName() %></td>
			<td><%= memVo.getEmail() %></td>
		</tr>
	</table>
	<p align="center"><a href="/jspEL/memberForm.html">새 회원 등록하기</a></p> 
</body>
</html>