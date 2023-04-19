package javapro.reference;

public class StringEx05 {

	public static void main(String[] args) {
		String str1 = "오늘은 학교에 가는 날이다.";
		int pos = str1.indexOf("학교"); //학교의 시작지점 자리. 
		System.out.println(pos);
		
		String str2 = "자바는 웹개발자가 되기 위해 자바를 배우고 있다.";
		int pos2 = str2.indexOf("자바",5); // 자바를 5번째 자리부터 찾는다.
		System.out.println(pos2);
		int pos3 = str2.lastIndexOf("자바"); // 자바를 뒤에서부터 찾는다.
		System.out.println(pos3); 
		
		String str3 = "비주얼베이직 입문";
		int pos4 = str3.indexOf("자바"); //없으면 -1이 출력됨.
		if(pos4 == -1) {
			System.out.println("자바를 찾을 수 없습니다.");
		}
		else {
			System.out.println("자바가 포함된 문장입니다.");
		}
		

	}

}
