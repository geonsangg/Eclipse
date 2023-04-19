package javapro.classEx;

public class PhysicalInfoEx01 {

	public static void main(String[] args) {
		PhysicalInfo ssong = new PhysicalInfo("쏭이", 10, 130.5f, 35.0f);
		printPhysicalInfo(ssong);
		ssong.update(11, 145.0f, 48.0f);
		printPhysicalInfo(ssong);
		ssong.update(12, 152.0f);
		printPhysicalInfo(ssong);
		ssong.update(13);
		printPhysicalInfo(ssong);
	}

	//신체정보 출력 메서드
	public static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : " + obj.getName());
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight); 
		System.out.println("==================");
	}
}
