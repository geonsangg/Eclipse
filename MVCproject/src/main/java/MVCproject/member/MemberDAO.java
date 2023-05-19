package MVCproject.member;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			// JNDI(Java Naming and Directory Interface)를 이용해서 DB를 연결
			// 필요한 자원을 키/값의 쌍으로 저장한 후 필요할 키를 이용해 값을 얻는 방법
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/oracle"); // "읽어올 데이터베이스"
		}catch (Exception e) {
			System.out.println("DB연결 오류");
		}
	}
	
	//회원 목록 메서드
	public List<MemberVO> listMembers() {
		List<MemberVO> membersList = new ArrayList();
		try {
			conn = dataFactory.getConnection();
			String query = "select * from membertbl order by joinDate desc";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO memVo = new MemberVO(id, pwd, name, email, joinDate);
				membersList.add(memVo);
			}
			rs.close();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			System.out.println("DB 조회 중 에러");
			e.printStackTrace();
		}
		return membersList;
	}
	//회원 등록 메서드
	public void addMember (MemberVO memVo) {
		try {
			conn = dataFactory.getConnection();
			String id= memVo.getId();
			String pwd = memVo.getPwd();
			String name = memVo.getName();
			String email = memVo.getEmail();
			String query = "insert into membertbl (id, pwd, name, email) values(?, ?, ?, ?)";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			System.out.println("DB 등록 중 에러");
			e.printStackTrace();
		}
	}
	
	//수정할 회원정보 찾는 메서드
	public MemberVO findMember(String _id) {
		MemberVO memFind = null;
		try {
			conn = dataFactory.getConnection();
			String query = "select * from membertbl where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			System.out.println(query);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			String email = rs.getString("email");
			Date joinDate = rs.getDate("joinDate");
			memFind = new MemberVO(id, pwd, name, email, joinDate);
			pstmt.close();
			rs.close();
			conn.close();
		}catch (Exception e) {
			System.out.println("수정할 자료 찾는 중 에러");
			e.printStackTrace();
		}
		return memFind;
	}
}
