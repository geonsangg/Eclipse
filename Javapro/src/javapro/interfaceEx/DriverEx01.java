package javapro.interfaceEx;

public class DriverEx01 {

	public static void main(String[] args) {
		/* 운전자는 철수
		 * 버스를 제공
		  철수의 버스*/
		Driver chulsu = new Driver(); 
		Bus bus = new Bus();
		chulsu.drive(bus);
		
		Driver gildong = new Driver();
		Taxi taxi = new Taxi();
		gildong.drive(taxi);
		
		Driver chanho = new Driver();
		Truck truck = new Truck();
		chanho.drive(truck);
		
	}

}
