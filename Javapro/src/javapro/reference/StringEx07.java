package javapro.reference;

public class StringEx07 {

	public static void main(String[] args) {
		String str = "박찬호,김철수,이영희,홍길동,이영표";
		String[] names = str.split(","); // ,로 분리하겠다. 이 문장에서 ,는 구분자. 구분자는 배열에 포함 안된다.
		System.out.println("** 합격자 명단 **");
		for(int i=0; i< names.length; i++) {
			System.out.println("이름 : " + names[i]);
		}

	}

}
