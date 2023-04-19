package javapro.variable;

public class VariableEx08 {

	public static void main(String[] args) {
		/* char = ''한문자 -> 정수 
		 String = " " 문자열 
		 \ = 이스케이프 문자 
		 역슬래쉬u = 16진수 
		 \t = 텝키만큼 띄어쓰기
		 \n = 줄바꿈 */
		String str1 = "철수가 말했다\"안녕\"이라고";
		System.out.println(str1);
		/* 1.자동타입변환 
		   큰 허용범위 타입 = 작은 허용범위 타입
		   2.강제타입변환
		   작은허용범위 타입 = (작은 허용범위 타입) 큰 허용범위 타입*/
		int num = 20;
		double dnum = num;
		System.out.println(num);
		double dnum1 = 5.3;
		int num1 = (int) dnum1;
		System.out.println(num1);
	}

}
