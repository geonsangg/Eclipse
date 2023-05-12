<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반복문</title>
</head>
<body>
<c:set var="dan" value="${param.dan}"/>
	<h2>** ${dan}단 **</h2>
	<c:forEach var="i" begin="1" end="9" step="1">
		<h2>${dan} X ${i} = ${dan*i}</h2>
	</c:forEach>
</body>
</html>