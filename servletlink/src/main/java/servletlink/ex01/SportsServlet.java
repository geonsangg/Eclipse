package servletlink.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sports")
public class SportsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		String user_id = request.getParameter("user_id");
		out.print("<html><body>");
		if(user_id !=null &&user_id.length() !=0) {
			out.print("<h3>" + user_id + "님이 로그인 중입니다.</h3>");
			out.print("<p>스포츠 중계 댓글을 남길 수 있습니다.</p>");
			out.print("댓글 <input type='text'>");
		}else {
			out.print("댓글 <input type='text' disabled>");
			out.print("<p>로그인 하지 않았습니다.</p><br>");
			out.print("<a href='/servletlink/login.html'>로그인 하기</a>");
			out.print("</body></html>");
			
		}
	}

}
