package javapro.statement;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("여행지를 선택하세요(1.미주 2.유럽. 3.동남아)>>");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("1층 안내 데스크로 가세요");
				break;
			case 2:
				System.out.println("2층 안내 데스크로 가세요");
				break;
			case 3: 
				System.out.println("별관 안내 데스크로 가세요");
				break;
			default: //단, default는 생략이 가능함. 위에 예시에서 default를 생략하면 다른 값을 입력하면 아무 값도 출력 안된다.
				System.out.println("여행지 선택이 잘못되었습니다.");
		}

	}

}
