package javapro.API;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("메서드1 실행");
		//PrintAnnotation 에 값을 입력 안했으니 value = - , number = 15
	}
	@PrintAnnotation("#")
	public void method2() {
		System.out.println("메서드2 실행");
		//PrintAnnotation 에 값을 "#" 만 넣었으니 value = "#" , number = 15
	}
	@PrintAnnotation(value = "=", number = 30)
	public void method3() {
		System.out.println("메서드3 실행");
		//PrintAnnotation 에 값을 value = "-", number = 30 을 넣었으니 이렇게.
	}

}
