package javapro.classEx02;

public class CarEx01 {

	public static void main(String[] args) {
		Car myCar = new Car(); //myCar 인스턴스 객체 생성
		myCar.tire = new Tire();
		myCar.run();
		myCar.tire = new HankookTire(); 
		myCar.run();
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
