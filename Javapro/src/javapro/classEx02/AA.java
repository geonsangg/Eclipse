package javapro.classEx02;

public class AA {
	int fieldAA1;
	public AA() {
		//로컬 클래스란 생성자 or 메서드 안에 생성된 메서드
		class BB {
			
		}
		BB bb = new BB(); //생성자 안에 만들어진 로컬클래스는 생성자 안에서만 사용가능
	}
	//메서드 
	void methodAA1() {
		//로컬 클래스
		class CC{
			
		}
		CC cc=new CC();//메서드 안에 만들어진 로컬클래스는 메서드 안에서만 사용가능
	}
}
