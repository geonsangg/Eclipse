package javapro.reference;

public class ArrayEx03 {

	public static void main(String[] args) {
		/*문제)시험점수를 가지고 합격자 명단을 출력하시오.(합격점수 >= 80)
		 * ** 합격자 명단 **
		 이름:박찬호
		 이름:이영희
		 이름:손흥민
		 이름:박상원*/
		int[] scores = {78,96,85,66,82,79,90};
		String[] names = {"홍길동","박찬호","이영희","이동국","손흥민","이영표","박상원"};
		System.out.println("** 합격자 명단 **");
		for(int i=0; i<scores.length; i++) {
			if(scores[i] >= 80) {
			System.out.println("이름 : " + names[i]);	
		}
		
	}

	}
}
