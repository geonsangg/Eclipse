package javapro.operator;

public class OperatorEx09 {

	public static void main(String[] args) {
		// &&(AND) ||(OR) ^(XOR) !(NOT)
		int ch = 'A';
		if (ch >= 65 && ch <= 90) {
			System.out.println("대문자입니다.");
		}
		if (ch >= 97 && ch <= 122) {
			System.out.println(("소문자입니다."));
		}
	}

}
