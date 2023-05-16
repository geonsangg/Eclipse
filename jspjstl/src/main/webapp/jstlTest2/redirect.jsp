<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
    %>
    <%@
    	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
    %>
    <c:redirect url="member1.jsp">
    	<c:param name="id" value="hong"/>
    	<c:param name="pwd" value="2435"/>
    	<c:param name="name" value="홍길동"/>
    	<c:param name="email" value="hong@gmail.com"/>
    </c:redirect>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료 전달</title>
</head>
<body>
	<a href="${infoURL }">회원정보출력</a>
	
</body>
</html>