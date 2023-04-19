package javapro.operator;

import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		//문제) 구입수량이 10개 이상이면 20%할인가를 적용하여 판매금액을 구하는 프로그램을 완성하시오. 또한 할인이 안될경우 정상가 할인이 될 경우 할인가 같이 출력하게 만드시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("구입 수량 : ");
		int amount = sc.nextInt();
		System.out.print("판매 단가 : ");
		int price = sc.nextInt();
		String memo = "(정상가)";
		if (amount >= 10) {
			price = (int)(price * 0.8);
			memo = "(할인가)";
		}
		int salesPrice = amount * price;
				System.out.println("판매금액 : " + salesPrice + memo);
		
		
		
		 

	}

}
