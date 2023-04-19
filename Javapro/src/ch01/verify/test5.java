package ch01.verify;

import java.util.Arrays;

public class test5 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		String my = my_string.replaceAll("[^0-9]", ",");
		System.out.println(my);
		String[] arr = my.split(",");
		for(String s : arr) {
			System.out.println(s);
			for(int i=0; i<arr.length; i++) {
				
			}
		}
		
		
	}

}
