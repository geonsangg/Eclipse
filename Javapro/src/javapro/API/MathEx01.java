package javapro.API;

public class MathEx01 {

	public static void main(String[] args) {
		double num1 = Math.abs(5); // Math.abs = 절대값
		System.out.println(num1);
		double num2 = Math.sqrt(2); // 루트
		System.out.println(num2);
		double num3 = Math.round(5.3); // 반올림
		System.out.println(num3);
		double num4 = Math.ceil(8.3); // 올림
		System.out.println(num4);
		double num5 = Math.ceil(-8.3); 
		System.out.println(num5);
		double num6 = Math.floor(8.3); // 내림
		System.out.println(num6);
		double num7 = Math.floor(-8.3); 
		System.out.println(num7);
		int num8 = Math.max(15, 78); // 큰값을 나타냄
		System.out.println(num8);
		int num9 = Math.min(15, 78); // 작은 값을 나타냄
		System.out.println(num9);
	}

}
