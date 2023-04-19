package javapro.reference;

public class StringEx04 {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		String str2 = str1.replace("자바", "JAVA"); //자바를 JAVA로 바꿔서 저장하는 매서드.
		System.out.println(str2);
		System.out.println(str1); // 원본은 바뀌지 않음.
		
		String str3 = "computer";
		System.out.println(str3.substring(3,6)); //c=0 o=1 m=2 p=3 3번째부터 6이전까지 가져온다.
		System.out.println(str3.substring(5)); //하나만쓰면 시작지점부터 끝까지.
		
		//문제) 주민번호 뒷자리가 ******* 으로 출력되는 프로그램을 만드시오. 
		String ssn = "970509-1234567";
		String ssn1 = (ssn.substring(0,7));
		System.out.println(ssn1 + "*******");
		
	}

}
