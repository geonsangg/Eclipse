package javapro.classEx;

public class AccountEx01 {

	public static void main(String[] args) {
	   //객체     객체변수   = 생성  객체
		Account geonsang = new Account(); //geonsang 인스턴스 객체 생성
		geonsang.accountNo = "111-222-333333";
		geonsang.ownerName = "이건상";
		geonsang.balance = 100; //100원을 넣으면서 통장을 만듬.
		Account leegeon = new Account();
		leegeon.accountNo = "111-333-444444";
		leegeon.ownerName = "리건";
		leegeon.balance = 0;
		geonsang.deposit(3000);
		geonsang.deposit(5000);
		leegeon.deposit(10000);  
		try {
		int amount = leegeon.withdraw(2000);
		System.out.println(geonsang.ownerName +"의 잔액 = " + geonsang.balance);
		System.out.println("==============================================");
		System.out.println("인출한 금액 =" + amount);
		System.out.println(leegeon.ownerName + "의 잔액 = " + leegeon.balance);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
