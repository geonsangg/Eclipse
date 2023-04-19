package javapro.reference;

public class StringEx01 {

	public static void main(String[] args) {
		/* 정수타입 = stack에 바로 저장
		   참조타입 = strack에 heap의 번지수를 저장 - heap에 참조타입 저장
		   null = 번지가 지워짐. heap에는 참조타입이 저장되있긴함. */
		//↓예시) str1이 heap에 이건상을 저장하고 stack에 번지수를 저장함.
		//      str2에 또 이건상을 저장하면 heap에 이건상이 있는걸 알고 같은 번지수를 저장하는것.
		String str1 = "이건상"; 
		String str2 = "이건상";
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조(메모리번지)가 같음.");
		}
		else {
			System.out.println("str1과 str2는 참조(메모리번지)가 다름.");
		}
		//즉 == 는 번지수가 같냐고 묻는거지 문자열 자체를 비교하는것은 아님.
		String str3 = new String("홍길동"); 
		String str4 = new String("홍길동");
		if(str3 == str4) {
			System.out.println("str1과 str2는 참조(메모리번지)가 같음.");
		}
		else {
			System.out.println("str1과 str2는 참조(메모리번지)가 다름.");
		}
		//↓ 문자열 비교 방법.
		if(str1.equals(str2)) {
			System.out.println("같은 문자열");
		}
		else {
			System.out.println("다른 문자열");
		}
		if(str3.equals(str4)) {
			System.out.println("같은 문자열");
		}
		else {
			System.out.println("다른 문자열");
		}
	}

}
