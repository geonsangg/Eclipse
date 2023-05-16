<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
    %>
    <%@
    	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
    %>
    <%
    	request.setCharacterEncoding("utf-8");
    %>
<c:set var="id" value="hong" scope="page"/>
<c:set var="pwd" value="1234" scope="page"/>
<c:set var="name" value="${'홍길동'}" scope="page" />
<c:set var="age" value="${25 }" scope="page"/>
<c:set var="height" value="${175 }" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">회원 출력</h2>
	<table border="1" align="center" width="700">
		<tr align="center" bgcolor="lightgreen">
			<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th>
		</tr>
			<tr align="center">
				<td>${param.id }</td>
				<td>${param.pwd }</td>
				<td>${param.name }</td>
				<td>${param.email }</td>
			</tr>
	</table>
	<p align="center"><a href="/jspEL/memberForm.html">새 회원 등록하기</a></p>
</body>
</html>