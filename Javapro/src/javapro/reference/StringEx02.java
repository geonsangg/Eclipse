package javapro.reference;

public class StringEx02 {

	public static void main(String[] args) {
		/*String str1 = "오늘은 자바갹체 배우는 날"; //오=0 늘=1 은=2  =3 자=4 바=5
		char ch = str1.charAt(5);
		System.out.println(ch); //출력값 = 바 */
		//문제 주민번호를 보고 성별을 출력하는 프로그램을 만드시오.
		String ssn ="970509-1234567";
		char ch = ssn.charAt(7);
		if(ch == '1' || ch == '3') {
			System.out.println("남성");
		}
		else if(ch == '2' || ch == '4') {
			System.out.println("여성");
		}
		else {
			System.out.println("잘못된 주민번호 입니다.");  
		}
		
	}

}
