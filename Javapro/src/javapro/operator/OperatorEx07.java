package javapro.operator;

public class OperatorEx07 {

	public static void main(String[] args) {
		/*try catch 쓰는 예시
		 * 어플리케이션에서는 에러일 경우 앱이 튕긴다. 
		   예시로 키와 몸무게를 입력하면 체지방량을 알려주는 앱이 있다. 
		   만약 몸무게를 입력안하고 진행 할 경우 앱이 튕김.
		   앱이 튕기지 않고 몸무게를 입력하라고 나오게 하기 위해 사용한다.
		 */
		//catch는 예외처리가 아닐 경우 수행x
		int num1 = 10;
		int num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println("연산결과 = " + result);
		} catch (ArithmeticException e) { //e는 변수. e.getMessage() or "하고싶은말" 로 사용가능
			System.out.println(e.getMessage()); 
		}
	}

}
