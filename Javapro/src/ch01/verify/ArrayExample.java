package ch01.verify;

public class ArrayExample {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			if (a < array[i]) {
				a = array[i];
			}
		}
		System.out.println("최대값 = " + a);
	int n = 3;
	System.out.println(n / 10);
	}	
	}


