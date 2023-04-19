package javapro.classEx02;

public class Driver {

	void drive(Vehicle vehicle) { //다형성. Vehicle을 상속받은 모든 클래스가 들어올 수 있다.
		vehicle.run();
	}
}
