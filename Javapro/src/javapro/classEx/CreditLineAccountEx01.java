package javapro.classEx;

public class CreditLineAccountEx01 {

	public static void main(String[] args) {
		CreditLineAccount geonsang = new CreditLineAccount("111-222-333333", "이건상", 10, 1000000);
		try {
		int amount = geonsang.withdraw(300000);
		System.out.println("인출액 : " + amount);
		System.out.println("잔액 : " + geonsang.balance);
		System.out.println("인출 가능액 : " + (geonsang.creditLine + geonsang.balance));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
