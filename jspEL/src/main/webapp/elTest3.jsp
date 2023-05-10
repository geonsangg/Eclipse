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
	<h1>표현 언어로 여러가지 데이터 출력(비교연산자)</h1>
	<h2>
		\${20==20} : ${20==20} <br>	
		\${20 eq 20} : ${20 eq 20} <br><br>
		\${"kbs"=="kbs"} : ${"kbs"=="kbs"} <br>	
		\${"kbs" eq "kbs"} : ${"kbs" eq "kbs"} <br><br>
		\${20!=20} : ${20!=20} <br>	
		\${20 ne 20} : ${20 ne 20} <br><br>
		\${"kbs"!="kbs"} : ${"kbs"!="kbs"} <br>	
		\${"kbs" ne "kbs"} : ${"kbs" ne "kbs"} <br><br>
		\${30>20} : ${30>20} <br>	
		\${30 gt 20} : ${30 gt 20} <br><br>
		\${30<20} : ${30<20} <br>	
		\${30 lt 20} : ${30 lt 20} <br><br>
		\${30>=20} : ${30>=20} <br>	
		\${30 ge 20} : ${30 ge 20} <br><br>
		\${30<=20} : ${30<=20} <br>	
		\${30 le 20} : ${30 le 20} <br><br>
	</h2>
</body>
</html>