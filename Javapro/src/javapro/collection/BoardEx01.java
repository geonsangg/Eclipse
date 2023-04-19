package javapro.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardEx01 {

	public static void main(String[] args) {
		List<Board> blist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("글쓰기를 종료하려면 제목에서 q를 입력하세요");
		while(true) {
			System.out.print("제목>>");
			String subject = sc.nextLine();
			if(subject.equals("q")) {
				break;
			}
			System.out.print("내용>");
			String content = sc.nextLine();
			System.out.print("글쓴이>>");
			String write = sc.nextLine();
			blist.add(new Board(subject, content, write));
			System.out.println();
		}
		System.out.println("게시판 글 목록");
		System.out.println("제목       내용         글쓴이");
		System.out.println("--------------------------------");
		/*for(int i=0; i<blist.size(); i++) {
			Board board = blist.get(i);
			System.out.println(board.getSubject() + "   " + board.getContent() + "    " + board.getWriter());
		}*/
		for(Board b : blist) {
			System.out.println(b.getSubject() + "   " + b.getContent() + "    " + b.getWriter());
		}
		System.out.println("--------------------------------");
		System.out.println("총 게시글 수 : " + blist.size());
	}

}
