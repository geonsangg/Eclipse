package javapro.classEx;

public class CarEx01 {

	public static void main(String[] args) {
		Car myCar = new Car("택시", "검정", 220);
		printCar(myCar);
		Car mycar2 = new Car("자가용");
		printCar(mycar2);
		Car mycar3 = new Car("자가용", "흰색");
		printCar(mycar3);

	}
	
	//출력 메소드
	public static void printCar(Car obj) {
		System.out.println("모델 : " + obj.model);
		System.out.println("색상 : " + obj.color);
		System.out.println("최고 속력 : " + obj.maxSpeed);
	}

}
