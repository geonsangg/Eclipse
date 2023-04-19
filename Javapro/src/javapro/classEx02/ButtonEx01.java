package javapro.classEx02;

public class ButtonEx01 {

	public static void main(String[] args) {
		Button btnGameStart = new Button();
		class OnListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("게임시작을 클릭했습니다.");
			}
			
		}//내부 클래스	
		btnGameStart.setClickListener(new OnListener());
		btnGameStart.click();
		Button btnResult = new Button();
		class ResultListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("결과 확인 버튼을 클릭했습니다.");
				
			}
			
		}//내부 클래스
		btnResult.setClickListener(new ResultListener());
		btnResult.click();
	}

}
