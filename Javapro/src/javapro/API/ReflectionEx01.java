package javapro.API;

public class ReflectionEx01 {

	public static void main(String[] args) {
		Class carInfo = Car.class;
		System.out.println(carInfo.getPackageName());
		System.out.println(carInfo.getSimpleName());
		System.out.println(carInfo.getName());
	}

}
