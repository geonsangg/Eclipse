package ch01.verify;

public class test {

	public static void main(String[] args) {
		System.out.println("===========");
		for(int i = 1; i <= 9; i++) {
			System.out.println("** " + i + " 단**");
			for(int d = 1; d <= 9; d++)
			System.out.println(i + " x " + d + " = " + d*i);
			if(i==3 || i==6 || i==9) {
				System.out.println("===========");
			}
		}

	}

}
