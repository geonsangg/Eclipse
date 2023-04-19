package javapro.classEx02;

public class AEx02 {

	public static void main(String[] args) {
		A.C c = new A.C(); //C클래스는 정적클래스이기 때문에 A를 선언안해도 사용가능.
		c.fieldC1=20;
		c.methodC1();

	}

}
