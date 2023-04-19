package javapro.operator;

import java.util.Scanner;

public class OperatorEx10 {

	public static void main(String[] args) {
		/*문제) 콘솔로 수량과 판매 단가를 입력받아 판매급액을 계산하는 프로그램을 완성하시오.
		 * 조건 1 : 수량을 10개 이상 구입하면 20% 할인가를 적용.
		 * 조건 2 : 정상가일 경우 정상가 출력 할인가일 경우 할인가 출력.
		 * 조건 3 : 단, 판매 단가가 1000원 미만인 품목은 제외.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("구입 수량 : ");
		int amount = sc.nextInt();
		System.out.print("판매 단가 : ");
		int price = sc.nextInt();
		String memo = "(정상가)";
		if (amount >= 10 && price >= 1000) {
			price = (int)(price * 0.8);
			memo = "(할인가)";
		}
		int salesPrice = amount * price;
				System.out.println("판매금액 : " + salesPrice + memo);
		
		
		
		 

	}

}
