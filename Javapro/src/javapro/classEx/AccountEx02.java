package javapro.classEx;

public class AccountEx02 {

	public static void main(String[] args) {
		                  //new 생성자(  ) 값을 초기에 저장해놓는것.
		Account geonsang = new Account("111-222-33333", "이건상" , 1000); 
		Account leegeon = new Account("111-333-444444", "리건", 0);
		geonsang.deposit(6000);
		leegeon.deposit(10000);
		try {
		geonsang.withdraw(2000);
		printAccount(geonsang);
		printAccount(leegeon);
		printAccount(new Account("123-456-789012", "손흥민", 30000)); //익명 객체 생성
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		

	//예금정보 출력 메서드
	public static void printAccount(Account obj) {
		System.out.println("거래은행 : " + Account.BANKNAME); // BANKNAME = 정적필드이기때문에 통상 클래스.정적필드 로 사용한다.
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println("----------------------------");
	}
	
}
