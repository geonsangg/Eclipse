package javapro.classEx02;

public class ButtonEx02 {

	public static void main(String[] args) {
		Button btnGameStart = new Button();
		//익명 객체
		btnGameStart.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("자! 게임을 시작합니다.");
				
			}
		});
		btnGameStart.click();
		
		Button btnResult = new Button();
		btnResult.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("게임 결과를 확인합니다.");
				
			}
		});
		btnResult.click();
	}

}
