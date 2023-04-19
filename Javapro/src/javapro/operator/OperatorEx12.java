package javapro.operator;

public class OperatorEx12 {

	public static void main(String[] args) {
		/*int value = 356;
		System.out.println((value / 100) * 100);*/
		
		//문제) : value에 어떤값을 넣어도 소수이하 2자리까지 출력 하는 프로그램을 만드시오.
		double value = 23.51423;
		 value =(int)(value * 100) / 100.0;
		System.out.println(value);

	}

}
