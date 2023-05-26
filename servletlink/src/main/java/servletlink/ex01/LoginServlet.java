package servletlink.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_hp = request.getParameter("user_hp");
		String user_email = request.getParameter("user_email");
		String user_address = request.getParameter("user_address");
		String data="<html><body>";
		data+=("<h2>로그인하셨습니다</h2><br>");
		data+=("<p>아이디: "+user_id+"</p><br>");
		data+=("<p>비밀번호: "+user_pw+"</p><br>");
		data+=("<p>연락처"+user_hp+"</p><br>");
		data+=("<p>이메일"+user_email+"</p><br>");
		data+=("<p>주소"+user_address+"</p><br>");
		data+=("</body></html>");
		out.print(data);
	}

}

