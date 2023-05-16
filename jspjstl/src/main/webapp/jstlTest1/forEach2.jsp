<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List dataList=new ArrayList();
	dataList.add("홍길동");
	dataList.add(50);
	dataList.add(true);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반복문</title>
</head>
<body>
	<c:set var="list" value="<%=dataList %>"/><!-- 객체를 표현언어로 쓸수 없음 -->
    <c:forEach var="i" begin="1" end="15" step="1" varStatus="loop">
   	   <c:if test="${loop.first }">
   	  	  <p>============================</p>
   	   </c:if>
      <h2>안녕하세요 => ${loop.count }</h2> 
      <c:if test="${loop.last }">
   	  	  <p>============================</p>
    </c:if>  
    </c:forEach>
    <c:forEach var="data" items="${list }" varStatus="idx">
   		<h2>${data}----${idx.index }</h2>
    </c:forEach>
    <c:set var="fruits" value="참외,수박,포도,메론,키위,사과,바나나"/>
    <c:forTokens var="token " items="${ fruits}" delims=","> <!-- delims는 구분자 -->
    	<h2>${token}</h2>
    
    </c:forTokens>
</body>
</html>