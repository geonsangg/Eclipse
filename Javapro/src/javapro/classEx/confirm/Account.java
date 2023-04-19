package javapro.classEx.confirm;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;

	public int getBlance() {
		return balance;
	}

	public void setBlance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}

	}

}
