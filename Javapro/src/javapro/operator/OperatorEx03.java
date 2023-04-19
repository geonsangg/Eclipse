package javapro.operator;

import java.util.Scanner;

public class OperatorEx03 {

	public static void main(String[] args) {
		/*문제 : 콘솔로 부터 수량을 입력받아 금액을 계산하는 프로그램을 완성하시오 (금액 = 수량 * 단가)
		 (10개이상 구입하면 20%할인 된 800원으로 계산하시오)  */
		Scanner sc = new Scanner(System.in);
		System.out.print("수량을 입력>>");
		int amount = sc.nextInt(); 
		int price = 1000;
		String memo = "(정상가)";
		if(amount >= 10) {
			price = 800;
			memo = "(할인가)";
		} 
		int salesPrice = amount * price;
		System.out.println("판매금액 =" + salesPrice + memo);
	}

}