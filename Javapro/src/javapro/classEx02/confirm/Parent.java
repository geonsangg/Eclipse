package javapro.classEx02.confirm;

public class Parent {
	// 필드
	public String nation;

	// 생성자
	public Parent() { //default 생성자를 받으면 이쪽으로 와서 1
		this("대한민국"); // 문자열 매개변수 하나를 호출 했으니  2
		System.out.println("Parent() call"); //다시 이쪽으로 와서 수행한다.6
	}

	public Parent(String nation) { //이쪽 생성자로 와서 3
		this.nation = nation; //nation에 대한민국을 넣고 4
		System.out.println("Parent(String nation) call"); //이게 먼저 수행한후 5
	}
}
