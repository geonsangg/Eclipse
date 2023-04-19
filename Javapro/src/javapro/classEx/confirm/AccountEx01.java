package javapro.classEx.confirm;

public class AccountEx01 {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBlance(10000);
		System.out.println("현재 잔고 : " + account.getBlance());
		
		account.setBlance(-10000);
		System.out.println("현재 잔고 : " + account.getBlance());
		
		account.setBlance(2000000);
		System.out.println("현재 잔고 : " + account.getBlance());
		
		account.setBlance(300000);
		System.out.println("현재 잔고 : " + account.getBlance());



	}

}
