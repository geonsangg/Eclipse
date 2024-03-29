package servletlink.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login4")
public class SessionLogin2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
		if(session.isNew()) {
			if(user_id != null) {
				session.setAttribute("user_id", user_id);
				String url = response.encodeURL("login4");
				out.print("<a href=" +url + ">로그인 상태 확인</a>");
			}else {
				out.print("<a href='login4.html'>다시 로그인 하기</a>");
				session.invalidate();
			}
		}else {
			user_id = (String)session.getAttribute("user_id");
			if(user_id != null && user_id.length() != 0) {
				out.print("안녕하세요 " + user_id + "님의 방문을 환영합니다.");
			}else {
				out.print("<a href='login4.html'>다시 로그인 하기</a>");
				session.invalidate();
			}
		}
	}
}
