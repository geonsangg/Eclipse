package javapro.statement;

public class ForEx10 {

	public static void main(String[] args) {
		//break는 switch뿐 아니라 반복문에서도 탈출로쓰임.
		//문제 3500이 넘으면 몇까지 더하면 될까요?
		int i;
		int sum = 0;
		for(i = 1; i <= 100; i++) {
			sum +=i;  //sum=sum+i;
			if(sum>3500) {
				break;
				}
			}//for
		System.out.println((i-1) + "까지 더하면 " + (sum-i) + "이므로 " + i + "를 더하면 "+ sum + "이 되어서 3500이 넘게된다.");
	}
}

