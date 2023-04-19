package javapro.classEx02;

public class AEx01 {

	public static void main(String[] args) {
		A a = new A(); //A 인스턴스 객체 생성
		a.filedA1 = 20;
		A.B b= a.new B();//B= A의 객체가 생성되야 생성가능하다.
   //A안에있는B클래스 b = a. new B();
	}

}
