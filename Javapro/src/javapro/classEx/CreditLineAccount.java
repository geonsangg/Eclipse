package javapro.classEx;
//마이너스 통장 클래스
public class CreditLineAccount extends Account{
	//필드
	int creditLine; //마이너스 한도
	//생성자
	public CreditLineAccount(String accountNo, String onwerName, int balance, int creditLine) {
		super(accountNo, onwerName, balance);
		this.creditLine = creditLine;
	}
	public CreditLineAccount() {
		
	}
	//메서드 오버라이딩 = 부모가 갖고 있는 메서드를 일부 수정해서 사용.
	//인출한다. 메서드 (Account클래스가 가지고 있는 인출한다. 메서드를 수정해서 사용)
	@Override //어노테이션 @Override = 밑에 메서드를 오버라이드 할거라고 알림. 오타방지
 	int withdraw(int amount) throws Exception{
		if((balance + creditLine) < amount) {
			throw new Exception("인출 할 수 없습니다.");
		}
		balance -= amount;
		return amount;
	}
	
}
