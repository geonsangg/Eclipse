package javapro.classEx;

public class AbstractEx01 {

	public static void main(String[] args) {
		Tiger tiger1 = new Tiger();
		Eagle eagle1 = new Eagle();
		tiger1.name = "호랑이";
		tiger1.age = 3;
		System.out.println(tiger1.name + "는 " + tiger1.age + "살 입니다.");
		tiger1.move();
		eagle1.home = "소나무둥지";
		eagle1.name = "독수리";
		System.out.println(eagle1.name + "는 " + eagle1.home + "에서 삽니다.");
		eagle1.move(); 
	}

}
