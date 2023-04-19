package javapro.variable;

public class VariableEx09 {

	public static void main(String[] args) {
		/*(↓예시)강제타입변환 할 때 타입의 허용범위를 넘으면 값이 소실되서 잘못 된 값이 나올 수 있음.
		int num = 23641;
		byte bnum = (byte) num;
		System.out.println(bnum); */
		byte num1 = 10;
		byte num2 = 20;
		int result = num1 + num2; // 정수 연산할 때에는 인트값으로 연산하기 때문.
		System.out.println(result);
		
		int value = 10;
		double dvalue = 5.3;
		double result2 = value + dvalue;
		System.out.println(result2);
		int value1 = 10;
		double dvalue1 = 5.3;
		int result3 = value1 + (int)dvalue1;
		System.out.println(result3);
		
		
	}

}
