package javapro.classEx;

public class PolymophismEx01 {

	public static void main(String[] args) {
		// 다형성 부모 변수 = new 자식  오버라이딩된 메서드를 사용.
		 
		Account acc1 = new Account(); 
		Account acc2 = new CheckingAccount(); // 선언을 Account로 했기때문에 Checking에 있는 pay 메서드는 사용할 수 없다.
		Account acc3 = new CreditLineAccount();// 선언을 Account 메서드에 withdraw메서드를 오버라이딩 했기때문에 오버라이딩 된 withdraw를 사용한다.

		//acc1은 부모객체 acc2는 자식객체이기때문에 acc1에 자동타입 변환된다.
		acc1 = acc2;
		//acc2 = 부모 객체이기때문에 자식 객체에 넣으려면 자식객체로 강제타입면환해야함.
		CheckingAccount acc4 = (CheckingAccount)acc2;
	}

}
