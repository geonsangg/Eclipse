package javapro.statement;

public class WhileEx02 {

	public static void main(String[] args) {
		//주사위 5가 나오면 멈추는 프로그램을 만들어라.
		//방법 : 1
		/*int dice = 0;
		while (dice != 5) {
			dice = (int) (Math.random() * 6) + 1;
			System.out.println(dice);
		}*/
		/* 방법 : 2
		int dice;
		while(true) {
			dice = (int) (Math.random() * 6) + 1;
			System.out.println(dice);
			if (dice == 5) {
				break;
			}
		} */
		// 방법 : 3
		int dice;
		boolean run = true;
		while (run) {
			dice = (int) (Math.random() * 6) + 1;
			System.out.println(dice);
			if (dice == 5) {
				run = false;
			}
		}
	}

}
