package javapro.variable;

public class VariableEx12 {

	public static void main(String[] args) {
		// { } <- 블럭이라고함. 블럭 안에서 선언 된 변수 는 블럭 안에서만 적용된다.
		int num1 = 50;
		int num2 = 0; // int num2; 로 선언할 경우 if문에서 false가 되었을 때 num2의 값이 없기 때문에 12번줄이 오류가 된다.
		if (num1 >= 20) {
			num2 = 30;
		}
		System.out.println(num1 + num2);

	}

}
