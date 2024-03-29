package servletlink.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		//쿠키를 배열로 생성
		Cookie[] value=request.getCookies();
		for(int i=0;i<value.length;i++) {
			if(value[i].getName().equals("cookieTest")) {
				out.print("<h3>쿠키값: "+URLDecoder.decode(value[i].getValue(),"utf-8")+ "</h3>");
			}
		}
	}

}
