<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   
<%
	request.setCharacterEncoding("utf-8");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 조회창</title>
</head>
<body>
	<h2 align="center">검색된 회원</h2>
	<table border="1" align="center" width="80%">
		<tr align="center" bgcolor="lightgreen">
			<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th> <th>가입일</th>
		</tr>
		<c:choose>
			<c:when test="${ empty member}">
				<tr align="center">
					<td colspan="5">검색된 회원이 없습니다.</td>
				</tr>
			</c:when>
			<c:when test="${!empty member}">
				<tr align="center">
				<td>${member.id}</td>
				<td>${member.pwd}</td>
				<td>${member.name}</td>
				<td>${member.email}</td>
				<td>${member.joinDate}</td>
			</tr>
			</c:when>
		</c:choose>
	</table>
</body>
</html>