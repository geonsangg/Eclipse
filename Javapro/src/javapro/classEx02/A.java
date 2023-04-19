package javapro.classEx02;

//A객체를 생성해야 B를 사용할 수 있음
public class A {
	int filedA1; //A클래스 필드
	static int filedA2; //A클래스 정적 필드
	public A() { //생성자
		System.out.println("클래스 A의 생성자");
	}
	//인스턴스 내부 클래스
	class B{ //인스턴스 내부 클래스는 바깥쪽(A) 객체를 생성해야 사용가능하다.
		int fieldB1=20; //인스턴스 클래스의 인스턴스 내무 클래스의 인스턴스 필드
		public B() { //내부 클래스 생성자
			System.out.println("내부 클래스 B의 생성자");
		}
		//메서드
		void methodB1() {
			System.out.println("내부 클래스 B의 메서드");
			filedA1=10;
			methodA1();
			filedA2=20;
			methodA2();
		}
	}
	//정적 내부 클래스
	static class C { //정적 내부클래스는 정적만 접근이 가능하다.
		int fieldC1=30;
		//메서드
		void methodC1() { 
			filedA2=30; //정적필드(A클래스)
			methodA2(); //정적메서드(A클래스)
		}
	}
	
	//메서드
	void methodA1() {
		System.out.println("클래스 A의 메서드");
		B b = new B(); // 인스턴스 b클래스 생성
		b.methodB1();
	}
	//정적 메서드
	static void methodA2() {
		System.out.println("클래스 A의 정적메서드");
	}
}