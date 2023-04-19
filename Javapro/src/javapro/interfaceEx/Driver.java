package javapro.interfaceEx;

public class Driver {
	// 메서드
	void drive(Vehicle vehicle) {
		vehicle.run();
		if (vehicle instanceof Bus) { // 객체타입확인 (vehicle에 들어온 매개변수가 Bus타입 이냐고 묻는것.)
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		if (vehicle instanceof Truck) {
			Truck truck = (Truck) vehicle;
			truck.loadUp();
		}
		/* 자바 12버전이상일 경우 아래처럼 사용가능
		 if(vehicle instanceof Bus bus){
		 bus.chekFare();
		 } */
	}
}
