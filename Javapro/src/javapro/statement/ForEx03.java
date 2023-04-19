package javapro.statement;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		/*문제) 원하는 단(구구단)을 입력받아 출력하는 프로그램을 완성하시오.
		 * 예시) 원하는 단은? 3
		 * ** 3단 **
		 * 3 x 1 = 3
		 * 3 x 2 = 6
		 * ...
		 * ...
		 * 3 x 9 = 27
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단은? ");
		int dan = sc.nextInt();
		System.out.println("**" + dan + "단**");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		

	}

}
