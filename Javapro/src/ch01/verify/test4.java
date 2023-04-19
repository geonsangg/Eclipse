package ch01.verify;

import java.util.Arrays;

public class test4 {

	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		int a = Integer.parseInt(bin1, 2); //문자열 = 2진수를 10진수 인트로변환
        int b = Integer.parseInt(bin2, 2);
		System.out.println(Integer.toBinaryString(a+b)); // 10진수를 2진수로 변환
        
		
	}
}
