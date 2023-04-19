package javapro.variable;

public class VariablaEx05 {

	public static void main(String[] args) {
		int num = 5/2;
		System.out.println(num);
		int num1 = 5%2;
		System.out.println(num1);
		/*문제 : 사과 1상자에 사과가 47개 있다.
		 * 가족 5명이 몇개씩 먹을 수 있으며 몇 개가 남을까?
		  출력 답 : 1명당 ??개 남은개서 ??개*/
		int apple = 47;
		System.out.println("1명당 " + (apple / 5) +"개" +" 남은개수 " + (apple % 5) + ("개"));
		//or
		int share = apple / 5;
		int remain = apple % 5;
		System.out.println("1명당 " + share +"개");
		System.out.println("남은개수 " + remain + "개");

		/*문제 : 총 소요시간이 분으로 되어 있다. 시간과 분을 분리해서 표현하시오.
		 * 예시) int minute = 65 예시 답: 1시간 5분 */
		int minute = 432;
		int share1 = minute / 60;
		int remain1 = minute % 60;
		System.out.println(share1 + "시간" + remain1 + "분");
		
		
	}

}
