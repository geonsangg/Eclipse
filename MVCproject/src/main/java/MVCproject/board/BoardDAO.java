package MVCproject.board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public BoardDAO() {
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
	
	// 글 목록 조회 메서드 
	public List<ArticleVO> selectAllArticles() {
		List<ArticleVO> articlesList = new ArrayList<ArticleVO>();
		try {
			conn=dataFactory.getConnection();
			String query = "SELECT LEVEL, articleNo, parentNo, title, content, id, writeDate FROM boardtbl START WITH parentNo=0 CONNECT BY PRIOR articleNo=parentNo " +
			"ORDER SIBLINGS BY articleNo DESC"; //계층형 쿼리문
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int level = rs.getInt("level");
				int articleNo = rs.getInt("articleNo");
				int parentNo = rs.getInt("parentNo");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String id = rs.getString("id");
				Date writeDate = rs.getDate("writeDate");
				ArticleVO articleVO = new ArticleVO();
				articleVO.setLevel(level);
				articleVO.setArticleNo(articleNo);
				articleVO.setParentNo(parentNo);
				articleVO.setTitle(title);
				articleVO.setContent(content);
				articleVO.setId(id);
				articleVO.setWriteDate(writeDate);
				articlesList.add(articleVO);
			}
			rs.close();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			System.out.println("글 목록 중 에러");
			e.printStackTrace();
		}
		return articlesList;
	}
}
