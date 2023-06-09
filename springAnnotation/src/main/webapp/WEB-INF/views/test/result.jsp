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
<title>로그인 결과창</title>
</head>
<body>
	<h1>로그인 결과</h1>
	<!-- <h2>로그인 한 아이디는 ${id}입니다.</h2>
	<h2>비밀번호는 ${pwd}입니다.</h2>
	<h2>이메일은 ${email}입니다.</h2>
	 -->
	<h2>로그인 한 아이디는 ${memberInfo.id}입니다.</h2>
	<h2>비밀번호는 ${memberInfo.pwd}입니다.</h2>
	<h2>이메일은 ${memberInfo.email}입니다.</h2>
</body>
</html>