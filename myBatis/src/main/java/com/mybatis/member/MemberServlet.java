package com.mybatis.member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		MemberDAO dao=new MemberDAO();
		String action=request.getParameter("action");
		String nextPage="";
		MemberVO memberVO=new MemberVO();
		if(action == null ||action.equals("listMembers")) {
			List<MemberVO> membersList=dao.selectAllMemberList();
			request.setAttribute("membersList", membersList);
			nextPage="listMembers.jsp";
		}else if(action.equals("memberForm")) {
			nextPage="memberForm.jsp";
		}else if(action.equals("insertMember")) {
			String id=request.getParameter("id");
			String pwd=request.getParameter("pwd");
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			memberVO.setId(id);
			memberVO.setPwd(pwd);
			memberVO.setName(name);
			memberVO.setEmail(email);
			dao.insertMember(memberVO);
			nextPage="/member.do?action=listMembers";
		}else if(action.equals("insertMember2")) {
			String id=request.getParameter("id");
			String pwd=request.getParameter("pwd");
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			Map<String, String> memberMap=new HashMap<String,String>();
			memberMap.put("id", id);
			memberMap.put("pwd", pwd);
			memberMap.put("name", name);
			memberMap.put("email", email);
			dao.insertMember2(memberMap);
			nextPage="/member.do?action=listMembers";
		}else if(action.equals("modMember")) {
			String id = request.getParameter("id");
			memberVO = dao.selectMemberById(id);
			request.setAttribute("member", memberVO);
			nextPage = "modMemberForm.jsp";
		}else if(action.equals("updateMember")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			memberVO.setId(id);
			memberVO.setPwd(pwd);
			memberVO.setName(name);
			memberVO.setEmail(email);
			dao.updateMember(memberVO);
			nextPage = "/member.do?action=listMembers";
		}else if(action.equals("delMember")) {
			String id = request.getParameter("id");
			dao.delMember(id);
			nextPage="/member.do?action=listMembers";
		}else if(action.equals("searchMember")) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			memberVO.setName(name);
			memberVO.setEmail(email);
			List<MemberVO> membersList = dao.searchMember(memberVO);
			request.setAttribute("membersList", membersList);
			nextPage = "listMembers.jsp";
		}else if(action.equals("foreachSelect")) {
			List<String> nameList = new ArrayList();
			nameList.add("건상");
			nameList.add("dddd");
			nameList.add("쿼티티");
			List<MemberVO> membersList = dao.foreachSelect(nameList);
			request.setAttribute("membersList", membersList);
			nextPage="listMembers.jsp";
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
		
	}
}
