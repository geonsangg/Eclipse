package javapro.statement;

public class ForEx09 {

	public static void main(String[] args) {
		/*문제) 보물섬을 찾으러 배를 타고 항해를 하다가 보물섬을 발견.
	보물섬 안에 동굴에 2kg 보물 30개 , 3kg 보물 30개
	배가 견딜 수 있는 무게 100kg (각종 장비 + 탐험가무게 = 70kg) 
	일 때 배에 보물을 실을 수 있는 모든 경우의 수의 값를 구하시오.*/
	int sum;
	for (int s = 1; s < 30; s++) {
		for (int b = 1; b < 30; b++) {
			sum = s * 2 + b * 3;
			if(sum == 30) {
				System.out.println("2kg 보물 = " + s + "개" + " 3kg 보물 = " + b + "개");
			}
		}
	}

	}

}
