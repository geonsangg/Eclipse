package javapro.statement;

public class WhileEx03 {

	public static void main(String[] args) {
		/*int i = 1;
		while(i >= 5) {
			System.out.println("안녕하세요");
			i++;
		}*/
		int i = 1;
		do {
			System.out.println("안녕하세요");
			i++;
		} while(i >= 5);
		// Do while = 먼저 수행하고 나중에 조건을 물어봄.
		// while 과 Do while 의 차이 = 무조건 한번이상은 수행하고 싶을 때 do while을 사용한다.
	}

}
