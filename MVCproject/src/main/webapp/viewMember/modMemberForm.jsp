<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
 	isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/> 
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정창</title>
</head>
<body>	<!-- disabled가 되어 있다면 submit해도 가져가지 않기 때문에 action에 매개변수로 넣어서 가져간다. -->
	<form action="${contextPath}/member/modMember.do?id=${memFindInfo.id}" method="post">
		<h2 align="center">회원 수정창</h2>
		<table align="center">
			<tr>
				<td width="200"><p align="right">아이디</p></td>
				<td width="400"><input type="text" name="id" value="${memFindInfo.id}" disabled></td>
			</tr>
			<tr>
				<td width="200"><p align="right">비밀번호</p></td>
				<td width="400"><input type="password" name="pwd" value="${memFindInfo.pwd}"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이름</p></td>
				<td width="400"><input type="text" name="name" value="${memFindInfo.name}"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이메일</p></td>
				<td width="400"><input type="text" name="email" value="${memFindInfo.email}"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">가입일</p></td>
				<td width="400"><input type="text" name="joinDate" value="${memFindInfo.joinDate}" disabled></td>
			</tr>
			<tr>
				<td width="200">&nbsp;</td>
				<td width="400">
					<input type="submit" value="수정하기"> 
					<input type="reset" value="다시입력">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>