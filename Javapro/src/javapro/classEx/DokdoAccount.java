package javapro.classEx;

//독도사랑 은행계좌 클래스
public class DokdoAccount extends Account {
	// 필드
	int point;

	// 생성자
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);
		this.point = point;
	}

	@Override
	void deposit(int amount) {
		super.deposit(amount); // super. = 부모메서드 호출
		point += (amount*0.001); //point = point + (int)(amount*0.001)   +=은 자동캐스팅 해준다.
	}
	
}
