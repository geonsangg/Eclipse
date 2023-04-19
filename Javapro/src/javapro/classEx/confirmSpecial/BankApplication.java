package javapro.classEx.confirmSpecial;

import java.util.Scanner;

public class BankApplication {
	// main 메서드 밖에서 만드는 이유는 main 메서드안에 넣으면 main 메서드가 너무 복잡해지기때문, 다른 메서드에서도 사용하려고.
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int count = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;

			}// switch
		} // while
		System.out.println("프로그램 종료");
	} // main

	// 계좌생성 메서드
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String onwer = sc.next();
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();
		accountArray[count] = new Account(ano, onwer, balance);
		System.out.println("결과 : 계좌가 생성되었습니다.");
		count++;
	}

	// 계좌목록 메서드
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (int i = 0; i < count; i++) {
			System.out.print(accountArray[i].getAccountNo() + "\t" + accountArray[i].getOwnerNo() + "\t"
					+ accountArray[i].getBalance() + "\n");
		}
	}

	// 예금하기 메서드
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("예금액: ");
		int amount = sc.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과 계좌가 없습니다.");
		} else {
			account.setBalance(account.getBalance() + amount);
			System.out.println("결과 : 예금이 성공되었습니다.");
		}

	}

	// 출금하기 메서드
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("예금액: ");
		int amount = sc.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과 계좌가 없습니다.");
		} else {
			if(account.getBalance() < amount) {
				System.out.println("결과 : 잔액이 부족합니다.");
			} else {
				account.setBalance(account.getBalance() - amount);
				System.out.println("결과 : 출금이 성공되었습니다.");
			}
		}

	}

	// 계좌번호 찾기 메서드
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < count; i++) {
			if (accountArray[i].getAccountNo().equals(ano)) {
				account = accountArray[i];
				break;
			}
		} // for
		return account;
	}

}// BankApplication
