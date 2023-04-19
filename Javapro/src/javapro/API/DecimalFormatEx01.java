package javapro.API;

import java.text.DecimalFormat;

public class DecimalFormatEx01 {

	public static void main(String[] args) {
		int price = 1560000;
		DecimalFormat df;
		df = new DecimalFormat("#,###"); //3자리 수 마다 ,를 찍어준다
		System.out.println("판매금액 : " + df.format(price));
		double num = 74251.3248;
		df = new DecimalFormat("#,###.##"); // 3자리 수 마다,를 찍고 소수점은 2자리만 나타낸다.
							//("#,###.00"); 도 같다. But 00= 소수점이 1자리면 남는자리에 0을 찍는다.
		System.out.println(df.format(num));
	}

}
