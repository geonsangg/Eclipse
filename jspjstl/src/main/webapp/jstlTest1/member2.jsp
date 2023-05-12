<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"
    import="java.util.*,jspjstl.ex01.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%> 
<jsp:useBean id="memberList" class="java.util.ArrayList"/>
<jsp:useBean id="memberMap" class="java.util.HashMap"/>
<%
	memberMap.put("id","apck");
	memberMap.put("pwd","1234");
	memberMap.put("name","박지성");
	memberMap.put("email","ppp.ppp@pp");
	MemberVO memVo1 = new MemberVO("son","5252","손흥민","son@hueng.min");
	MemberVO memVo2=new MemberVO("min","1222","김민재","min@gmail.com");
	memberList.add(memVo1);
	memberList.add(memVo2);
	memberMap.put("member",memberList);
%>
<c:set var="memberList" value="${memberMap.memberList}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 창</title>
</head>
<body>
	<h2 align="center">회원 정보 출력</h2>
	<table border="1" align="center" width="700">
		<tr align="center" bgcolor="lightgreen">
			<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th>
		</tr>
		<tr align="center">
			<td>${memberMap.id}</td>
			<td>${memberMap.pwd}</td>
			<td>${memberMap.name}</td>
			<td>${memberMap.email}</td>
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
	<p align="center"><a href="/jspEL/memberForm.html">새 회원 등록하기</a></p> 
</body>
</html>