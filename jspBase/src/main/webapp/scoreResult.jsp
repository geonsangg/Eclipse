<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	int score = Integer.parseInt(request.getParameter("score"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 처리 프로그램</title>
</head>
<body>
	<%
		if(score > 100 || score < 0) {
	%>
	<h2>시험 점수를 다시 입력해주세요</h2>	
	<%
		} else { 
	%>	
		<h2><%= name %>님의 시험점수는 <%= score %>점 입니다.</h2>
		<% 
			if(score >= 90) {				
		%>
			<h2>평과 결과는 A학점입니다.</h2>
		<%
			} else if(score >= 80) {
		%>
			<h2>평과 결과는 B학점입니다.</h2>
		<%
			} else if(score >= 70) {
		%>
	 		<h2>평과 결과는 C학점입니다.</h2>
		<%
			} else if(score >= 60) { 
		%>
			<h2>평과 결과는 D학점입니다.</h2>
		<%
			} else {
		%>
			<h2>평과 결과는 F학점입니다.</h2>
		<%	
			}
		}
	 %>
	<a href="/jspBase/scoreTest.html">시험점수입력</a>
</body>
</html>