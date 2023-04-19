package javapro.statement;

import java.util.Scanner;

public class IFEx02 {

	public static void main(String[] args) {
		/* 문제) 점수를 콘솔로 입력받아 등급을 구하는 프로그램을 완성하시오.
		 * 90점이상 = A등급 80점~89 = B등급, 70~79 = C등급, 60~69 = D등급, 59이하 = F등급
		 +중첩 if문 추가.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력>>");
		int score = sc.nextInt();
		if(score >= 0 && score <= 100) {	
			if(score >= 90) {
				System.out.println("A등급");
			}                                 
			else if(score >=80 && score <=89) { // (score >=80) 으로 해도 가능 단, 구하는 값이 한개일 때.
				System.out.println("B등급");     // 이유 : score하나의 값만 구하기 때문에 socre >= 90 은 아니라는 전에가 깔림.
			}
			else if(score >=70 && score <=79) {
				System.out.println("C등급");
			}
			else if(score >=60 && score <=69) {
				System.out.println("D등급");
			}
			else {
				System.out.println("F등급");
			}
		} else {
			System.out.println("점수입력오류");
		}
	}
}


