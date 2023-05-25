package MVCproject.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardService {
   BoardDAO boardDAO;
   
   public BoardService() {
      boardDAO=new BoardDAO();
   }
   //글목록 요청
   public List<ArticleVO> listArticles(){
      List<ArticleVO> articlesList=boardDAO.selectAllArticles();
      return articlesList;
   }
   //글목록 요청 (페이징기능 추가)
   public Map listArticles(Map<String, Integer> pagingMap) {
	   Map articleMap = new HashMap();
	   List<ArticleVO> articlesList = boardDAO.selectAllArticles(pagingMap);
	   int totArticles = boardDAO.selectToArticles();
	   articleMap.put("articlesList", articlesList);
	   articleMap.put("totArticles", totArticles);
	   return articleMap;
   }
   
   //글 추가 요청
   public int addArticle(ArticleVO articleVO) {
      return boardDAO.insertNewArticle(articleVO);
   }
   //상세보기 요청
   public ArticleVO viewArticle(int articleNo) {
      ArticleVO articleVO=null;
      articleVO=boardDAO.selectArticle(articleNo);
      return articleVO;
   }
   //수정하기 요청
   public void modArticle(ArticleVO articleVO) {
      boardDAO.updateArticle(articleVO);
   }
   public List<Integer> removeArticle(int articleNo) {
      List<Integer> articleNolist=boardDAO.selectRemovedArticles(articleNo);
      boardDAO.deleteArticle(articleNo);
      return articleNolist;
   }
   public int addReply(ArticleVO articleVO) {
	   return boardDAO.insertNewArticle(articleVO);
   }
}