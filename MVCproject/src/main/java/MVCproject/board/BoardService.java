package MVCproject.board;

import java.util.List;

public class BoardService {
	BoardDAO boardDAO;
	
	public BoardService() {
		boardDAO = new BoardDAO();
	}
	// 글 목록 보기 서비스
	public List<ArticleVO> listArticles() {
		List<ArticleVO> articlesList = boardDAO.selectAllArticles();
		return articlesList;
	}
	// 글 추가 서비스
	public int addArticle(ArticleVO articleVO) {
		return boardDAO.insertNewArticle(articleVO);
	}
	// 선택한 글 상세 내용 보기 서비스
	public ArticleVO viewArticle(int articleNo) {
		ArticleVO articleVO = null;
		articleVO = boardDAO.selectArticle(articleNo);
		return articleVO;
	}
	
	public void modArticle(ArticleVO articleVO) {
		boardDAO.updateArticle(articleVO);
	}
}
