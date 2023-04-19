package javapro.lambda;

public class CalculableEx03 {

	public static void main(String[] args) {
		Calculable calculable;
		calculable=(x,y) -> {
			System.out.println("두 수의 합 = " + (x+y));
		};
		calculable.calculate(4, 3);
		
		calculable=(x,y) -> {
			System.out.println("두 수의 차 = " + (x-y));
		};
		calculable.calculate(4, 3);
	}

}
