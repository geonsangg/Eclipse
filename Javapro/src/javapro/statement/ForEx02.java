package javapro.statement;

public class ForEx02 {

	public static void main(String[] args) {
		System.out.println("**토큰 가격표**");
		int token = 370;
		for(int i=1; i<=10; i++) {
			System.out.println("토큰 " + i + "개 가격= " + i*token);
		}

	}

}
