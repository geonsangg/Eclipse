package javapro.statement;

public class ForEx05 {

	public static void main(String[] args) {
		/* int num = (int) (Math.random() * 6) + 1; 
		 * System.out.println(num);*/
		System.out.println("** 로또 자동 번호 생성 **");
		for (int i = 1; i <= 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			System.out.println(num);
		}
	}

}
