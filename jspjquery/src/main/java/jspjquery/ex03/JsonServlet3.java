package jspjquery.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@WebServlet("/json3")
public class JsonServlet3 extends HttpServlet {

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
		String info = (String)request.getParameter("info");
		JSONObject totalObject = new JSONObject(); //JSON배열을 저장할 JSON객체
		JSONArray jsonArray = new JSONArray(); //JSON배열
		if(info.equals("member")) {
			JSONObject memberInfo = new JSONObject(); //한 명의 회원정보가 들어갈 JSON객체
			memberInfo.put("name", "홍길동");
			memberInfo.put("age", 50);
			memberInfo.put("job", "도적");
			jsonArray.add(memberInfo);
			memberInfo = new JSONObject();
			memberInfo.put("name", "손흥민");
			memberInfo.put("age", 31);
			memberInfo.put("job", "축구선수");
			jsonArray.add(memberInfo);
			memberInfo = new JSONObject();
			memberInfo.put("name", "김철수");
			memberInfo.put("age", 29);
			memberInfo.put("job", "회사원");
			jsonArray.add(memberInfo);
			totalObject.put("members", jsonArray);
		}else if(info.equals("book")) {
			JSONObject bookInfo = new JSONObject();
			bookInfo.put("title", "jQuery 입문");
			bookInfo.put("writer", "한빛미디어 : 윤인성");
			bookInfo.put("image", "http://127.0.0.1:8090/jspjquery/images/jajq.png");
			jsonArray.add(bookInfo);
			bookInfo = new JSONObject();
			bookInfo.put("title", "Node.js 프로그램");
			bookInfo.put("writer", "한빛미디어 : 윤인성");
			bookInfo.put("image", "http://127.0.0.1:8090/jspjquery/images/node.jpg");
			jsonArray.add(bookInfo);
			totalObject.put("books", jsonArray);
		}		
		String jsonInfo = totalObject.toJSONString(); //JSON객체를 문자열로 변환
		out.print(jsonInfo); //문자열 데이터를 브라우저로 전송
	}
}
