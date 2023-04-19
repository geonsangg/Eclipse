package javapro.reference;

public class StringEx06 {

	public static void main(String[] args) {
		//문제) 주어진 문자열에서 서울이란 문자를 찾아 그 문자부터 끝까지 출력한다.
		String str1 = "나는 지금 서울 종로구에 있다";
		int str2 = str1.indexOf("서울");
		System.out.println(str1.substring(str2));
		
		boolean result = str1.contains("서울"); //있으면 true 없으면 false
			if(result) {
				System.out.println("서울과 관련이 있군요");
			}
			else {
				System.out.println("서울과 관련이 없군요");
			}
	}

}
