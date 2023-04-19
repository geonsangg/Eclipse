package javapro.variable;

public class VariableEx06 {

	public static void main(String[] args) {
		/*문제 : 금액을 화폐단위별로 분리 하는 프로그램을 완성하시오.
		 * (만원,오천원,천원,오백원,백원,십원)
		 출력 값 : 
		 만원 - 7 장
		 오천원 - 1장
		 천원 - 3장
		 오백원 - 1개
		 백원 - 1개
		 십원 -3개
		 */
		// 나의 답
		/*int money = 78630;
		int man = money / 10000;
		int fcwon = (money - man * 10000) / 5000;
		int cwon = (money - man * 10000 - fcwon * 5000) / 1000;
		int fwon = (money - man * 10000 - fcwon * 5000 - cwon * 1000) / 500;
		int bwon = (money - man * 10000 - fcwon * 5000 - cwon * 1000 - fwon * 500) / 100;
		int swon = (money - man * 10000 - fcwon * 5000 - cwon * 1000 - fwon * 500 - bwon * 100) / 10;
		System.out.println("만원 -" + man + "장");
		System.out.println("오천원 - " + fcwon + "장");
		System.out.println("천원 - " + cwon + "장");
		System.out.println("오백원 - " + fwon + "개");
		System.out.println("백원 - " + bwon + "개");
		System.out.println("십원 - " + swon + "개"); */
		
		 //선생님 답
		 int money = 78630;
		 int man = money / 10000;
		 money = money % 10000;     //78630 = 78630 % 10000 ->money 8630
		 int fcwon = money / 5000;
		 money = money % 5000;       //8630 = 8630 % 5000 -> money 3630
		 int cwon = money / 1000;
		 money = money % 1000;      //3630 = 3630 % 1000 -> money 630
		 int fwon = money / 500;
		 money = money % 500;       //630 = 630 % 500 -> money 130
		 int bwon = money / 100; 
		 money = money % 100;       //130 = 130 % 100 -> money 30
		 int swon = money / 10;
		 
		 System.out.println("만원 -" + man + "장");
		 System.out.println("오천원 - " + fcwon + "장");
		 System.out.println("천원 - " + cwon + "장");
		 System.out.println("오백원 - " + fwon + "개");
		 System.out.println("백원 - " + bwon + "개");
		 System.out.println("십원 - " + swon + "개");
	}

}
