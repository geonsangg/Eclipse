package javapro.classEx;
//체크카드 클래스
public class CheckingAccount extends Account{ //extends = 상속  CheckingAccount =자식 Account =부모
	//필드
	String cardNo; //카드번호
	//생성자
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		/*this.accountNo = accountNo; //accountNo 필드가 보이는 이유는 Account 클래스를 상속받았기 때문. 
		this.ownerName = ownerName;
		this.balance = balance;*/
		super(accountNo, ownerName, balance); //super = 부모 생성자를 호출하는것.
		this.cardNo = cardNo;
	}
	public CheckingAccount() {
		
	}
	//카드로 지불한다.메서드
	int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo) || balance < amount) {
			throw new Exception("지불이 불가능합니다.");
		}
		return withdraw(amount);
	}
}
