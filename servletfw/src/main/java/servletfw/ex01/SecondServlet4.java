package servletfw.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second4")
public class SecondServlet4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<p>"+ name + "님의 Dispatch를 이용한 포워딩 실습입니다.</p>");
		if(age >= 20) {
			out.println("<p>현장실습이 가능합니다.</p>");
		} else {
			out.println("<p>" + age + "나이는 현장실습이 가능합니다.</p>");
		}
		out.println("</body></html>");
	}

}
