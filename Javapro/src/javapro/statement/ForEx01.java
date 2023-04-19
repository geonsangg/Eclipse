package javapro.statement;

public class ForEx01 {

	public static void main(String[] args) {
		/* for (초기화 값;조건식;,증감식)
		 반복문의 변수는 간단하게준다.
		 증가 예시
		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요. " + i);
		}*/
		/*감소 예시
		 * for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}*/
		for(int i=1; i<=10; i=i+2) {
			System.out.println(i);
		}
	}

}
