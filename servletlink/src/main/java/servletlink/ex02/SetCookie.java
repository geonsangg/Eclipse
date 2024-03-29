package servletlink.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		Date today= new Date();
		Cookie ck=new Cookie("cookieTest",URLEncoder.encode("주말 잘 보내세요","utf-8"));
		//쿠키의 수명을 정해줌
		ck.setMaxAge(24*60*60);
		//addcookie:만든 쿠키를 브라우저로 전송
		response.addCookie(ck);
		out.print("쿠키 생성 시간:"+today);
		out.print("쿠키가 저장되었습니다.");
		 
	}

}
