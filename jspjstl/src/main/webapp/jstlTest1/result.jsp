<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<c:set var="name" value="${param.name}"/>
<c:set var="score" value="${param.score}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험점수 결과 창</title>
</head>
<body>
	<c:choose>
		<c:when test="${score>=0 && score<=100}">
		<h2>${name}님의 시험점수는 ${score}점 입니다.</h2>
			<c:choose>
				<c:when test="${score>=90}">
					<c:set var="grade" value="A"/>
				</c:when>
				<c:when test="${score>=80}">
					<c:set var="grade" value="B"/>
				</c:when>
				<c:when test="${score>=70}">
					<c:set var="grade" value="C"/>
				</c:when>
				<c:when test="${score>=60}">
					<c:set var="grade" value="D"/>
				</c:when>
				<c:otherwise>
					<c:set var="grade" value="F"/>
				</c:otherwise>
			</c:choose>
			<h2>시험 등급은 ${grade}입니다.</h2>
		</c:when>
		<c:otherwise>
			<h2>시험점수를 잘못입력했습니다.</h2>
			<h2><a href="score.jsp">시험점수 다시 입력하기</a></h2>
		</c:otherwise>
	</c:choose>
</body>
</html>