package servletBase2.ex01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clogin2")
public class CoursesServlet2 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init메서드 호출");
	}

	public void destroy() {
		System.out.println("destroy메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Enumeration enu = request.getParameterNames();
		while(enu.hasMoreElements()) {  //hasMoreElements() = 요소가 있을 떄까지 
			String name =(String)enu.nextElement();  // nextElement() = 다음요소  , String으로 형변환 한 것은 nextElement로 객체로 받았기때문
			String[] values = request.getParameterValues(name); //요소를 하나씩 받아서 values배열에 넣는다.
			for(String s : values) {
				System.out.println("매개변수이름( " + name + "):" + s);
			}
		}
	}

}
