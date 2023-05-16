<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*, jspjstl.ex01.*"%>
<%@
    taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%>
<%
    request.setCharacterEncoding("utf-8");
%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리 DB처리</title>
<jsp:useBean id="memVo" class="jspjstl.ex01.MemberVO"/>
<jsp:setProperty property="*" name="memVo"/>
<%
	MemberDAO dao = new MemberDAO();
	dao.addMember(memVo);
	List memberList = dao.listMembers();
	request.setAttribute("memberList", memberList);
%>
</head>
<body>
	<jsp:forward page="memberList.jsp"/>
</body>
</html>