package javapro.classEx;

public class Car {
	//필드
	String model;
	String color;
	int maxSpeed;
	//생성자
	//↓ 은색,250 = 마지막 생성자 color,maxSpeed에 들어가서 입력.
	public Car(String model) {
		this(model, "은색", 250); //컬러와 최고속력을 고르지 않으면 은색,250으로 고정한다.
	}
	//↓  250 = 마지막 생성자 maxSpeed에 들어가서 입력.
	public Car(String model, String color) { //최고속력을 고르지 않으면 250으로 고정한다.
		this(model, color, 250); 
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
