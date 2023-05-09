<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspBase.ex02.*"%>
 <%
 	request.setCharacterEncoding("utf-8");
 	String _name = request.getParameter("name");
 	MemberVO memVo = new MemberVO();
 	memVo.setName(_name);
 	MemberDAO dao = new MemberDAO();
 	List memberList = dao.listMembers(memVo);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 출력창</title>
</head>
<body>
	<h1 align="center"></h1>
	<table border="1" width="700" align="center">
		<tr align="center" bgcolor="lightgreen">
			<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th><th>가입일</th>
		</tr>
		<%
			for(int i=0; i<memberList.size(); i++) {
				MemberVO vo =(MemberVO)memberList.get(i);
				String id = vo.getId();
				String pwd = vo.getPwd();
				String name = vo.getName();
				String email = vo.getEmail();
				Date joinDate = vo.getJoinDate();
		%>
			<tr align="center">
				<td><%= id %></td>
				<td><%= pwd %></td>
				<td><%= name %></td>
				<td><%= email %></td>
				<td><%= joinDate %></td>
		<%
			}
		%>		
			</tr>
	</table>
</body>
</html>