package javapro.statement;

import java.util.Scanner;

public class IFEx01 {

	public static void main(String[] args) {
		/*단순IF : if(조건){ ... }; 일 경우 조건이 true 일 때 { } 안에 명령문 수행.
		 *기본IF : if (조건) {...} else {....} 조건이 ture일 경우 if에 { } 수행. false 일 경우 else에 { } 수행 
		 *문제) 점수를 콘솔로 입력받아 합격여부를 판단하는 프로그램을 완성하시오.(합격점수는 80점 이상)
		 예시) 점수를 입력>>72            점수를 입력>>85
		      불합격입니다.              합격하셨습니다.
		      다음에 응시해주세요.         12월28일까지 회사에 방문해주세요.
		                 수고하셨습니다.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력>>");
		int score = sc.nextInt();
		if(score >= 80) {
			System.out.println("합격하셨습니다.\n" + "12월28일까지 회사에 방문해주세요.");
		}
		else { 
			System.out.println("불합격입니다.\n" + "다음에 응시해주세요.");
		}//if     <- if문 끝나는 지점에 주석을 달아두면 나중에 보기 편하다.
		System.out.println("수고하셨습니다.");
	} 
	

}
