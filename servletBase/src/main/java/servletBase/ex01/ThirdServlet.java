package servletBase.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/third")  // 같은 애플리케이션 안에 같은 맵핑이 있으면 안된다.
public class ThirdServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init메서드 호출>>>>third");
	}

	public void destroy() {
		System.out.println("destroy메서드 호출>>>>third");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet메서드 호출>>>>third");
	}

}
