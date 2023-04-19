package javapro.classEx02.confirm;

public class Child extends Parent {

	// 필드
	public String name;

	// 생성자
	public Child() {
		//super(); 가 생략되어있음.    
		this("홍길동"); //매개변수 하나인 생성자 호출
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
