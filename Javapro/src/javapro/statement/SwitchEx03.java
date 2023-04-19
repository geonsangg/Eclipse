package javapro.statement;

public class SwitchEx03 {

	public static void main(String[] args) {
		//switch에서 break가 없으면 나올때까지 밑에 명령문 다 실행. 
		char grade = 'A';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}

}
