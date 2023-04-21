package servletBase2.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugu")
public class GuguDanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	int dan = Integer.parseInt(request.getParameter("dan"));
	out.println("<html>");
	out.println("<body>");
	out.print("<h2>** " + dan +"단 **</h2>");
	for(int i=1; i<10; i++) {
		out.print("<p>" + dan + "X" + i +  " = " + dan*i +"</p>");
	}
	out.print("<a href='//127.0.0.1:8090/servletBase02/gugudan/gugu.html'>단 입력창으로 이동</a>");
	out.println("</body>");
	out.println("</html>");	
	}

}
