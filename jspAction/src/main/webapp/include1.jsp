<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>애견 카페</h1>
	<jsp:include page="img_include.jsp" flush="true">
		<jsp:param value="달마시안" name="name"/>
		<jsp:param value="dalmatian.jpg" name="imgName"/>
	</jsp:include>
	<p>저희 애견 카페에 자주 찾아와 주세요</p>
</body>
</html>