package javapro.interfaceEx;

public class Tiger extends Animal implements iAnimal{
          //Animal을 상속받고 iAnimal을 구현한다.
	@Override
	public void eat() {
		System.out.println("멧돼지를 잡아먹습니다.");
		
	}

	@Override
	public void move() {
		System.out.println("네발로 이동합니다.");
		
	}

}
