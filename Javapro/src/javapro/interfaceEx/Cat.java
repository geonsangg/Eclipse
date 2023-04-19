package javapro.interfaceEx;
  //인터페이스는 자식     구현      부모 (extends를 사용하지않고 implements를 사용한다)
public class Cat implements iAnimal{

	@Override
	public void eat() {
		System.out.println("생선을 좋아합니다.");
		
	}

}
