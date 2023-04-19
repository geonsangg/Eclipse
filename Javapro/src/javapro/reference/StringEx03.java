package javapro.reference;

public class StringEx03 {

	public static void main(String[] args) {
		/*String str1 = "couputer";
		System.out.println(str1.length());*/
		//문제 ) 주민번호를 입력했을 때 자리수가 맞는지 아닌지 출력하는 프로그램을 만드시오.
		String ssn = "970509-1234567";
		int len = ssn.length();
		if(len == 14) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}
		else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		} 
	}

}
