package javapro.statement;

public class ForEx07 {

	public static void main(String[] args) {
		/* 뮨제 )
		 * 출력값 *
		 *      **
		 *      ***
		 *      ****
		 *      ***** 
	    나의답
		int num = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = num--; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(); <- 줄만 바꿈
		} 
		교수님답
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		} 
		역삼각형으로 만드시오.
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		트리를 만드세요 1+3+5+7+9+11*/
		for (int i = 1; i <= 15; i++) {
			for(int b = 15; b > i; b--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
	
			}
		
		 
	}
	

