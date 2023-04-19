package javapro.collection;

import java.util.List;
import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		//ArrayList = 같은 메서드를 쓰면 소실 될 수 있음
		//Vector 를 사용하면 같은 메서드를 사용할 때 하나의 메서드가 실행될 동안 다른 메서드는 잠긴다. 
		List<Board> blist = new Vector<>();
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					blist.add(new Board("안녕" + i, "모두 화이팅 " +i, "홍길동"));
				}
			}
		};
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					blist.add(new Board("잘가" + i, "모두 잘가세요 " +i, "김철수"));
				}
			}
		};
		threadA.start();
		threadB.start();
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("총 게시글 수 :" + blist.size());
		

	}

}
