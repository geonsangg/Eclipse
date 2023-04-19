package javapro.classEx;

public class DokdoAccountEx01 {

	public static void main(String[] args) {
		DokdoAccount geonsang = new DokdoAccount("111-222-333333", "이건상", 0, 0);
		geonsang.deposit(50000);
		System.out.println("잔액 : " + geonsang.balance);
		System.out.println("포인트 : " + geonsang.point);
		geonsang.deposit(20000);
		System.out.println("잔액 : " + geonsang.balance);
		System.out.println("포인트 : " + geonsang.point);
	}

}
