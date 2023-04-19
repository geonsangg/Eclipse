package javapro.classEx;

public class AccountEx04 {

	public static void main(String[] args) {
		Account geonsang = new Account("111-222-333333", "이건상");
		printAccount(geonsang);
	}

	//예금정보 출력 메서드
		public static void printAccount(Account obj) {
			System.out.println("계좌번호 : " + obj.accountNo);
			System.out.println("예금주 : " + obj.ownerName);
			System.out.println("잔액 : " + obj.balance);
			System.out.println("----------------------------");
		}
}
