package javapro.statement;

public class ForEx08 {

	public static void main(String[] args) {
		/*문제) 식당(족 전문집) - 돼지족,오리족
	직영농장 : 돼지,오리 (수급)
	족은 자루에 담아서 식당으로 가져오고 
	몸통은 납품업체에 전달해주고 영수증만 가져오기
	자루에 돼지족,오리족을 담았는데 자루에(56족)이라는 개수만 적음
	영수증 : 총 17마리 ....원 
	56족과 17마리로 가져온 돼지,오리가 몇개인지 for문으로 구하시오.*/
	int sum;
	for (int p = 1; p < 17; p++) {
		for (int d = 1; d < 17; d++) {
			sum = p * 4 + d * 2;
			if(sum == 56 && (p+d) == 17) {
				System.out.println("돼지마리수 = " + p + ", 오리마리수 = " + d);
			}
		}
	}

	}

}
