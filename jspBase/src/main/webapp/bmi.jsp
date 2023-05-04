<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	double height = Double.parseDouble(request.getParameter("height"));
	double weight = Double.parseDouble(request.getParameter("weight"));
	double bmi = (height-100) * 0.9;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비만도 체크</title>
</head>
<body>
	<h2>당신의 체형은</h2>
	<%
		String result = "";
		String imgName = "";
		if(bmi+5 < weight) {
			result = "비만입니다. 운동하세요";
			imgName = "ob.jpg";
		} else if(bmi-5 > weight) {
			result = "마른체형입니다. 많이 드세요";
			imgName = "thin.jpg";
		}else {
			result = "표준입니다. 유지하세요";
			imgName = "good.png";
		}	
	%>
		<h2><%=result %></h2>
		<img src="./images/<%= imgName %>" alt="">	
	<a href="bmi.html">다시 입력하기</a>
</body>
</html>