package javapro.interfaceEx;

public class BusEx01 {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();

	}

}
