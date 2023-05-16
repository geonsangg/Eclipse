<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"isELIgnored="false"
    %>
    <%@
    	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multilanguage page</title>
</head>
<body>
	<a href="main_ko.jsp">korean</a> <a href="main_en.jsp">english</a>
	<fmt:setLocale value="en_US"/><!-- 한국어를 기본으로 사용 -->
	<fmt:bundle basename="resource.main"><!-- 리소스 폴더의 메인을 사용 -->
		<h1><fmt:message key="mem.title"/></h1>
		<h2><fmt:message key="mem.name"/></h2>
		<h2><fmt:message key="mem.address"/></h2>
		<h2><fmt:message key="mem.job"/></h2>
	</fmt:bundle>
</body>
</html>