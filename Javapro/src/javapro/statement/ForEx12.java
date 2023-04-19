package javapro.statement;

public class ForEx12 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				continue;
			}
			sum +=i;  // <- 는 if문이 true 일경우 수행 안하고 다시 반복문으로 올라간다.
		}
		System.out.println("1부터 100까지의 합(5의 배수는 제외)= " + sum);

	}

}
