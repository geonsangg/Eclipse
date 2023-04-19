package javapro.classEx02;

public class DriverEx01 {

	public static void main(String[] args) {
		Driver geonsang = new Driver();
		Bus bus = new Bus();
		geonsang.drive(bus); //Driver클레스의 drive메서드(bus = Vehicle 이기에 Vehicle을 상속받은 Bus객체 의 run()호출. ) 
		Taxi taxi = new Taxi();
		geonsang.drive(taxi);
		Truck truck = new Truck();
		geonsang.drive(truck);
	}

}
