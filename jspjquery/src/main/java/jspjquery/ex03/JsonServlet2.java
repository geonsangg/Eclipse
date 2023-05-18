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

@WebServlet("/json2")
public class JsonServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject totalMember = new JSONObject(); //JSON배열을 저장할 JSON객체
		JSONArray memberArray = new JSONArray(); //JSON배열
		JSONObject memberInfo = new JSONObject(); //한 명의 회원정보가 들어갈 JSON객체
		memberInfo.put("name", "홍길동");
		memberInfo.put("age", 50);
		memberInfo.put("job", "도적");
		memberArray.add(memberInfo);
		memberInfo = new JSONObject();
		memberInfo.put("name", "손흥민");
		memberInfo.put("age", 31);
		memberInfo.put("job", "축구선수");
		memberArray.add(memberInfo);
		memberInfo = new JSONObject();
		memberInfo.put("name", "김철수");
		memberInfo.put("age", 29);
		memberInfo.put("job", "회사원");
		memberArray.add(memberInfo);
		totalMember.put("members", memberArray);
		String jsonInfo = totalMember.toJSONString(); //JSON객체를 문자열로 변환
		out.print(jsonInfo); //문자열 데이터를 브라우저로 전송
	}
}
