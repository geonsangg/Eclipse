<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>표현 언어로 여러가지 데이터 출력(논리연산자)</h1>
	<h2>
		\${50==50 && 20==20} : ${50==50 && 20==20} <br>
		\${50==50 and 20==20} : ${50==50 and 20==20} <br><br>
		\${50==50 || 20==20} : ${50==50 || 20==20} <br>
		\${50==50 or 20==20} : ${50==50 or 20==20} <br><br>
		\${!(50==50)} : ${!(50==50)} <br>
		\${not(50==50)} : ${not(50==50)} <br>	
	</h2>		
</body>
</html>