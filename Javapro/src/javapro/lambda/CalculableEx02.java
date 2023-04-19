package javapro.lambda;

public class CalculableEx02 {

	public static void main(String[] args) {
		Calculable calculable;
		calculable = new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("두 수의 합 = " + (x+y));				
			}
		};
		calculable.calculate(4, 3);
		calculable = new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("두 수의 차 = " + (x-y));
				
			}
		};
		calculable.calculate(4, 3);
	}

}
