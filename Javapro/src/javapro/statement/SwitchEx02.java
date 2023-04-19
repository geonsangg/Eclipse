package javapro.statement;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력>>");
		int score = sc.nextInt();
		score /= 10;
		switch (score) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("F등급");
		}
	}

}
