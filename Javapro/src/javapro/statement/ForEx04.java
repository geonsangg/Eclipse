package javapro.statement;

public class ForEx04 {

	public static void main(String[] args) {
		/* 문제) 1부터 100까지 짝수의 합과 홀수의 합을 분리해서 출력하시오.
		 * 출력값 : 1부터 100까지 홀수의 합 = ??
		          1부터 100까지 짝수의 합 = ??*/
		int oddSum = 0, evenSum = 0;			
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("1부터 100까지의 홀수의 합 = " + oddSum);
		System.out.println("1부터 100까지의 짝수의 합 = " + evenSum);
	}

}
