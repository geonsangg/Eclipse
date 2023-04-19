package javapro.operator;

import java.util.Scanner;

public class OperatorEx04 {

	public static void main(String[] args) {
		/* 뮨제 : 콘솔로 부터 점수를 입력받아 합격여부를 알려주는 프로그램을 완성하시오.
		 (80점 이상이 합격점수)
		 출력 값 : 점수를 입력 >> 70(입력시)
		 다음에 다시 응시해주세요.
		 수고하셨습니다.
		 점수를 입력 >> 90(입력시)
		 합격입니다.
		 수고하셨습니다.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력>>");
		int score = sc.nextInt();
		String memo = "다음에 다시 응시해주세요.";
		if(score >= 80) {
			memo = "합격입니다.";
		}
		System.out.println(memo);
		System.out.println("수고하셨습니다.");
	}
	
}
	
