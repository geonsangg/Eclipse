package ch01.verify;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int student = 0;
		int[] scores = null;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("학생수 >");
				student = sc.nextInt();
				scores = new int[student];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] >");
					scores[i] = sc.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] :" + scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / student;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				break;
			case 5:
				run = false;
			}// switch
		} // while
		System.out.println("프로그램 종료");

	}

}
