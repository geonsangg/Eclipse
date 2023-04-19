package javapro.classEx.confirmSpecial;

public class Account {
	//필드
	private String accountNo; //private가 붙는 이유는 값을 스케너로 받기 때문.
	private String ownerNo;
	private int balance;
	//생성자
	public Account(String accountNo, String ownerNo, int balance) {
		this.accountNo = accountNo;
		this.ownerNo = ownerNo;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerNo() {
		return ownerNo;
	}
	public void setOwnerNo(String ownerNo) {
		this.ownerNo = ownerNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
