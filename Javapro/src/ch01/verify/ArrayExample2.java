package ch01.verify;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		int peo = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				peo++;
			}
		} System.out.println("전체 합 = " + sum);
		 System.out.println("전체 평균 = " + (double)sum / peo);
	}

}
