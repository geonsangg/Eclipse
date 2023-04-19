package javapro.variable;

public class VariableEx13 {

	public static void main(String[] args) {
		// f(format) = 형식
		// %s=실수,%d=정수,%f=실수
		int value = 150;
		System.out.printf("상품의 수량은 %d개입니다.\n", value);

		double dvalue = 3.14;
		System.out.printf("원주율 값 =%5.2f \n", dvalue);
		// 예시) %5.2f = %(전체 5자리중).(소수 2자리)f 를 출력한다. 단, 전체자리수에 .(소수점)도 포함

		String name = "이건상";
		System.out.printf("내 이름은 %s입니다.\n", name);
		/* 문제 )↓출력값 :
		   상품의 수량 : 7개 
		   상품의 가격 : 3500원 */
		int amount = 7;
		int price = 3500;
		System.out.printf("상품의 수량 : %d개\n상품의 가격 : %d원\n", amount, price);
		/* 문제 )↓출력갑 :
		 * 이건상의 키는 175cm이고 몸무게는 62kg입니다.
		 */
		int height = 172;
		int weight = 68;
		System.out.printf("%s의 키는 %dcm이고 몸무게는 %dkg입니다.", name, height, weight);
	}

}
