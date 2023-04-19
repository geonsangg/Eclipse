package ch01.verify;

public class test2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i += 3) {
			for (int k = 1; k <= 9; k++) {
				for (int j = i; j < i + 3; j++)
					System.out.printf("%d x %d = %2d\t", j, k, j * k);

				System.out.println();
			}
			System.out.println();
		}
	}

}
