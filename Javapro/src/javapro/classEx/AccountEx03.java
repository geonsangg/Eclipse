package javapro.classEx;

public class AccountEx03 {

	public static void main(String[] args) {
		Account geonsangg = new Account("111-222-333333", "이건상", 10);
		geonsangg.deposit(5000);
		geonsangg.deposit(7000);
		try { 
			int amount = geonsangg.withdraw(2000);
			System.out.println("출금 금액 : " + amount);
		} catch (Exception e) { //Account에 throw 가 던지면 carch가 받는것. e가 매개변수 받는것.
			System.out.println(e.getMessage());
		}
	}

}
