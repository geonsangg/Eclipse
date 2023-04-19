package javapro.interfaceEx;

public interface iAnimal {
 //인터페이스는 인스턴스 필드를 가질 수 없다.(상수는 가능)
 //인터페이스는 기본적으로 추상 메서드만 만든다.
	void eat(); //클래스에서는 추상 메서드를 만들 때 abstract를 사용해야하지만 인터페이스는 생략 가능하다.
}
