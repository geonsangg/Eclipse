package servletlink.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/show")
public class ShowMember extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id="";
		Boolean isLogon = false;
		HttpSession session = request.getSession(false);
		if(session != null) {
			isLogon=(Boolean)session.getAttribute("isLogon");
			if(isLogon==true) {
				id=(String)session.getAttribute("log_id");
				out.print("<html><body>");
				out.print("<p>" + id + "님은 골드회원입니다.</p>");
				out.print("<p>할인권을 이용해보세요</p>");
				out.print("</body></html>");
			}else {
				response.sendRedirect("logindb.html");
			}
		}else {
			out.print("<script>alert('로그인한 후에 이용해주세요'); location.href='logindb.html'; </script>");
		}
	}

}
