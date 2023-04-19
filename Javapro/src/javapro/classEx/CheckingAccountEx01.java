package javapro.classEx;

public class CheckingAccountEx01 {

	public static void main(String[] args) {
		CheckingAccount chulsu = new CheckingAccount("111-222-333333", "이건상", 10, "1111-2222-3333-4444");
		chulsu.deposit(5000);
		// throws Exception을 사용하면 무조건 try catch를 사용해야함.
		try {
			int paidAmount = chulsu.pay("1111-2222-3333-4444", 2000);
			System.out.println("지불액 : " + paidAmount);
			System.out.println("잔액 : " + chulsu.balance);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
