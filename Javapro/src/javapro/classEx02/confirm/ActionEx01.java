package javapro.classEx02.confirm;

public class ActionEx01 {

	public static void main(String[] args) {
		Action action = new Action() { //익명 객체
			
			@Override
			public void work() {
				System.out.println("복사를 합니다."); 
				
			}
		};
		action.work(); //메서드실행
	}

}
