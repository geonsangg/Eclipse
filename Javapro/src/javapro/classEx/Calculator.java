package javapro.classEx;

public class Calculator {
	//메서드
	// ... 변수 (가변길이 메서드)매개변수 길이만큼 배열로 받음. 단. 타입이 같을 때.
	int add(int ... nums) { //add = 메서드 이름
		int sum = 0;
		for(int i = 0; i<nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
}
