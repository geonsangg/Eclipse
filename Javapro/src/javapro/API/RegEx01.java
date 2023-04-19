package javapro.API;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호입력>>");
		String phoneNumber = sc.next();
		String regExp ="(02|010)-\\d{3,4}-\\d{4}"; 
		// ^: ex) "[^abc]" = abc가 안들어가야 true
		// "[a-zA-Z]" = 영문자가 들어가면 true
		boolean result = Pattern.matches(regExp, phoneNumber); // ,뒤에 단어가(1단어) regExp안에 있으면 true
		if(result) {
			System.out.println("올바른 전화번호입니다.");
		} else {
			System.out.println("전화번호 형식이 아닙니다.");
		}
		System.out.print("이메일 입력>>");
		String email = sc.next();
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // ()? =()안이 있을 수도 있고 없을 수도 있다는 뜻.
		// " " 안에는 정규표현식을 쓰려면 \를 넣어줘야함.
		result = Pattern.matches(regExp, email);
		if(result) {
			System.out.println("올바른 이메일주소입니다.");
		} else {
			System.out.println("이메일 주소형식이 아닙니다.");
		}
	}

}
