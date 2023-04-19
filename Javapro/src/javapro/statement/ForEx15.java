package javapro.statement;

public class ForEx15 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int d=5; d>=6-i; d--) {
				System.out.print(d);
			}
			System.out.println();
		}

	}

}
