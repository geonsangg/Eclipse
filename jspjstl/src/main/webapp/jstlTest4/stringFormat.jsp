<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    isELIgnored="false"
%>
    <%@
    	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
    %>
  	<%@
    	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포맷팅 태그 라이브러리</title>
</head>
<body>
	<h2>
		<c:set var="price" value="350000s0"/>
		<fmt:formatNumber var="priceNum" value="${price}" type="number"/>
		상품가격: ${priceNum}원	
	</h2>
	<h2>
		<c:set var="rate" value="0.2"/>
		<fmt:formatNumber var="rateNum" value="${rate}" type="percent" /><!-- 0.2를 퍼센트로 만들어줌 -->
		할인율:${rateNum}
	</h2>
	<h2>
		<c:set var="price2" value="2300" />
		<fmt:formatNumber var="priceNum2" value="${price2}" type="currency" currencySymbol="$" groupingUsed="false"/><!-- 화폐기호를 붙여줌 -->
		상품가격: ${priceNum2}
	</h2>
	
	<h2>
		<c:set var="now" value="<%=new Date() %>"/>
		<fmt:formatDate var="fnow" value="${now}" type="date"/>
		<fmt:formatDate var="fnow2" value="${now}" type="date" dateStyle="full"/>
		<fmt:formatDate var="fnow3" value="${now}" type="date" dateStyle="short"/>
		오늘 : ${fnow2} <br>
		오늘 : ${fnow3} <br>
		<fmt:formatDate var="fnow4" value="${now}" type="time" timeStyle="short"/>
		<fmt:formatDate var="fnow5" value="${now}" type="time" timeStyle="full"/>
		현재시간: ${fnow4 }<br>
		현재시간: ${fnow5 }<br>
		<br><br>
		<fmt:formatDate var="fnow6" value="${now}" type="both" dateStyle="full"/>
		한국 현재 시간: ${fnow6 }<br>
		<fmt:timeZone value="America/New York">
		뉴욕 현재 시간: <fmt:formtDate value="${now}" type="both" dateStyle="full" timeStyle="full"/>
		</fmt:timeZone>
	</h2>
</body>
</html>