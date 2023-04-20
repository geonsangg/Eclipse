package servletBase2.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init메서드 호출");
	}

	public void destroy() {
		System.out.println("destroy메서드 호출");
	}
						//request - 요청받은 값    response - 클라이언트한테 되돌려주는 값
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // request에 한글이 오면 인코딩을 utf-8로 한다는 것
		String user_id = request.getParameter("user_id"); //getParameter = 매개변수를 얻어오겠다는 것. (" ") 안에는 input name 값
		String user_pw = request.getParameter("user_pw");
		System.out.println("요청받은 아이디 : " + user_id);
		System.out.println("요청받은 비밀번호 : " + user_pw);
	}

}
