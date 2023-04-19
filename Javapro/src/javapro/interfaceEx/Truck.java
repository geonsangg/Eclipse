package javapro.interfaceEx;

public class Truck implements Vehicle{

	@Override
	public void run() {	
		System.out.println("트럭이 달립니다.");
	}
	
	public void loadUp() {
		System.out.println("물건을 적재합니다.");
	}

}
