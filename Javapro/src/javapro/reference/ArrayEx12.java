package javapro.reference;

public class ArrayEx12 {

	public static void main(String[] args) {
		int[] nums = {23,89,45,361,15,90,74};
		int sum = 0;
		//향상된 for문 for(타입 변수: 배열명) { .... }
		for(int num: nums) { //num에 nums의 0번째부터 마지막까지 순차적으로 들어감
			sum += num;
				}
		System.out.println("총합 = " + sum);

	}

}
