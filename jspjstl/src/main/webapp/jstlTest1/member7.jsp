<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,jspjstl.ex01.*"
    isELIgnored="false"
    %>
    <%@
    	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
    %>
	<%
		List memberList=new ArrayList();
		MemberVO mem1=new MemberVO("son","1234","손흥민","son@gmail.com");
		MemberVO mem2=new MemberVO("lee","1454","이강인","lee@gmail.com");
		MemberVO mem3=new MemberVO("kim","7654","김민재","kim@gmail.com");
		memberList.add(mem1);
		memberList.add(mem2);
		memberList.add(mem3);
	%>
<c:set var="memlist" value="<%=memberList %>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">회원 출력</h2>
	<table border="1" align="center" width="700">
		<tr align="center" bgcolor="lightgreen">
			<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th>
		</tr>
		<c:forEach var="member" items="memList">
			<tr align="center">
				<td>${member.id }</td>
				<td>${member.pwd }</td>
				<td>${member.name }</td>
				<td>${member.email }</td>
			</tr>
		</c:forEach>
	</table>
	<p align="center"><a href="/jspEL/memberForm.html">새 회원 등록하기</a></p>
</body>
</html>