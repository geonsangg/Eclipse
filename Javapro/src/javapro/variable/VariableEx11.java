package javapro.variable;

public class VariableEx11 {

	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20";
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		// Integer.parseInt(문자열) = 문자열을 인트로 바꿈.
		String str3 = String.valueOf(10);
		String str4 = String.valueOf(3.14);
		System.out.println(str3 + str4);
		// String.valueof(숫자) = 숫자를 문자열로 바꿈
	}

}
