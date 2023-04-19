package javapro.statement;

import java.util.Scanner;

public class IFEx03 {

	public static void main(String[] args) {
		/*문제) 키와 몸무게를 콘솔로 입력받아 비만도를 체크하는 프로그램을 완성하시오.
		 *조건1. 표준몸무게 = (키 - 100) * 0.9
		 조건2. 정상 => 표준몸무게의 +5,-5까지
		 조건3.정수값만 사용.
		 예시) 
		 키를 입력 >>
		 몸무게를 입력>> 
		 정상입니다.꾸준히 유지하세요. or 비만입니다.운동하세요 or 마른체형입니다. 밥 많이 드세요. */
		Scanner sc = new Scanner(System.in);
		System.out.print("키>>");
		int height = sc.nextInt();
		System.out.print("몸무게>>");
		int weight = sc.nextInt();
		int anwser = (int)((height - 100) * 0.9);
		if(weight > anwser + 5) {
			System.out.println("비만입니다. 운동하세요.");
		}
		else if(weight >= anwser -5) { // weight > anwser + 5 가 아니라는 전제.
			System.out.println("정상입니다. 꾸준히 유지하세요.");
		}
		else {
			System.out.println("마른체형입니다. 밥 많이 드세요.");
		}
		/*나의 답.
		 * if (weight <= (anwser +5) && weight >= (anwser - 5)) {
			System.out.println("정상입니다. 꾸준히 유지하세요.");
		}
		else if (weight > (anwser + 5)) {
			System.out.println("비만입니다. 운동하세요.");
		}
		else {
			System.out.println("마른체형입니다. 밥 많이 드세요.");*/
		}
		
	}


