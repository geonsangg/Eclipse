package javapro.classEx;
//신체정보 클래스
public class PhysicalInfo {
	//필드
	private String name; // 이름
	int age; //나이
	float height, weight; //키,몸무게
	
	
	//생성자
	public PhysicalInfo(String name, int age, float height, float weight ) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//메서드
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//메서드 오버로딩 = 같은 메서드를 여러개 만드는 것 (단.매개변수 개수가 다르거나 타입이 달라야함) 
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	void update(int age) {
		this.age = age;
	}
	public String getName() { //getter = private(접근제한자)인 필드를 외부에서 읽게하기위해서.(읽기전용)
		return name;
	}
	
}
