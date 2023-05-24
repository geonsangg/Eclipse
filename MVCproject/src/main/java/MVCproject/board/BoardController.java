package MVCproject.board;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	BoardService boardService;
	ArticleVO articleVO;
	// 글에 첨부한 이미지 저장 위치를 상수로 선언
	private static String ARTICLE_IMG_REPO = "D:\\geon\\board\\image_upload";

	public void init(ServletConfig config) throws ServletException {
		boardService = new BoardService();
		articleVO = new ArticleVO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextPage = "";
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		String action = request.getPathInfo(); // 요청명을 가져온다.
		System.out.println("요청이름 : " + action);
		try {
			List<ArticleVO> articlesList = new ArrayList<ArticleVO>();
			if (action == null || action.equals("/listArticles.do")) {
				articlesList = boardService.listArticles();
				request.setAttribute("articlesList", articlesList);
				nextPage = "/viewBoard/listArticles.jsp";
				
			} else if (action.equals("/articleForm.do")) {
				nextPage = "/viewBoard/articleForm.jsp";
				
			} else if (action.equals("/addArticle.do")) {
				int articleNo = 0;
				Map<String, String> articleMap = upload(request, response);
				String title = articleMap.get("title");
				String content = articleMap.get("content");
				String imageFileName = articleMap.get("imageFileName");
				articleVO.setParentNo(0); // DB에서 default값을 0으로 설정했기때문에 사용안해도 된다.
				articleVO.setId("geon");
				articleVO.setTitle(title);
				articleVO.setContent(content);
				articleVO.setImageFileName(imageFileName);
				articleNo = boardService.addArticle(articleVO);
				// 새 글 추가시 이미지를 첨부한 경우에만 수행
				if (imageFileName != null && imageFileName.length() != 0) {
					File srcFile = new File(ARTICLE_IMG_REPO + "\\temp\\" + imageFileName);
					File destDir = new File(ARTICLE_IMG_REPO + "\\" + articleNo);
					destDir.mkdirs(); // 폴더 만드는 메서드
					FileUtils.moveFileToDirectory(srcFile, destDir, true); // 폴더에 파일을 옮기는 메서드
					srcFile.delete();
				}
				out = response.getWriter();
				out.print("<script>");
				out.print("alert('새 글을 추가했습니다');");
				out.print("location.href='" + request.getContextPath() + "/board/listArticles.do';");
				out.print("</script>");
				return;

			} else if (action.equals("/viewArticle.do")) {
				String articleNo = request.getParameter("articleNo");
				articleVO = boardService.viewArticle(Integer.parseInt(articleNo));
				request.setAttribute("article", articleVO);
				nextPage = "/viewBoard/viewArticle.jsp";

			} else if (action.equals("/modArticle.do")) {
				Map<String, String> articleMap = upload(request, response);
				int articleNo = Integer.parseInt(articleMap.get("articleNo"));
				String title = articleMap.get("title");
				String content = articleMap.get("content");
				String imageFileName = articleMap.get("imageFileName");
				articleVO.setArticleNo(articleNo);
				articleVO.setParentNo(0);
				articleVO.setId("geon");
				articleVO.setTitle(title);
				articleVO.setContent(content);
				articleVO.setImageFileName(imageFileName);
				boardService.modArticle(articleVO);
				// 이미지를 새로 첨부한 경우에만 수행
				if (imageFileName != null && imageFileName.length() != 0) {
					String originalFileName = articleMap.get("originalFileName");
					File srcFile = new File(ARTICLE_IMG_REPO + "\\temp\\" + imageFileName);
					File destDir = new File(ARTICLE_IMG_REPO + "\\" + articleNo);
					destDir.mkdirs();
					FileUtils.moveFileToDirectory(srcFile, destDir, true);
					File oldFile = new File(ARTICLE_IMG_REPO + "\\" + articleNo + "\\" + originalFileName);
					oldFile.delete();
				}
				out = response.getWriter();
				out.print("<script>");
				out.print("alert('글을 수정했습니다');");
				out.print("location.href='" + request.getContextPath() + "/board/viewArticle.do?articleNo=" + articleNo + "';");
				out.print("</script>");
				return;
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			System.out.println("요청 처리 중 에러");
			e.printStackTrace();
		}
	}

	// 이미지 파일 업로드 + 새글 관련 정보 저장
	private Map<String, String> upload(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String> articleMap = new HashMap<String, String>();
		String encoding = "utf-8";
		// 글 이미지 저장 폴더에 대한 파일 객체 생성
		File currentDirPath = new File(ARTICLE_IMG_REPO);
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setRepository(currentDirPath);
		factory.setSizeThreshold(1024 * 1024);
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List items = upload.parseRequest(request);
			for (int i = 0; i < items.size(); i++) {
				FileItem fileItem = (FileItem) items.get(i);
				if (fileItem.isFormField()) {
					System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
					// 파일 업로드할 이미지와 같이 전송된 새글 관련(제목, 내용) 매개변수를 Map(키, 값)으로 저장
					articleMap.put(fileItem.getFieldName(), fileItem.getString(encoding));
				} else {
					System.out.println("매개변수이름 : " + fileItem.getFieldName());
					System.out.println("파일(이미지)이름 : " + fileItem.getName());
					System.out.println("파일(이미지)크기 : " + fileItem.getSize() + "bytes");
					if (fileItem.getSize() > 0) {
						int idx = fileItem.getName().lastIndexOf("\\");
						if (idx == -1) {
							idx = fileItem.getName().lastIndexOf("/");
						}
						String fileName = fileItem.getName().substring(idx + 1);
						articleMap.put(fileItem.getFieldName(), fileName);
						File uploadFile = new File(currentDirPath + "\\temp\\" + fileName);
						fileItem.write(uploadFile);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("파일 업로드 중 에러");
			e.printStackTrace();
		}
		return articleMap;
	}
}
