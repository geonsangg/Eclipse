package javapro.Generic;

public class GenericEx03 {

	public static void main(String[] args) {
		HomeAgency myHomeAgency = new HomeAgency();
		Home myHome = myHomeAgency.rent();
		myHome.turnOnLight();
		
		ScarAgency myScarAgency = new ScarAgency();
		SCar mySCar = myScarAgency.rent();
		mySCar.run();

	}

}
