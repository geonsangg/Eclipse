package javapro.reference;

public class ArrayEx02 {

	public static void main(String[] args) {
		/*int[] nums = new int[5]; // 5개의 기억장소를만든다. [0][1][2][3][4]
		nums[0] = 10;
		nums[3] = 75;
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}*/
		//문제)홀수를 제외한 짝수들의 합을 구하는 프로그램을 만드시오.
		int[] nums = {78,23,45,96,12,36,23,75};
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] % 2 == 0) {
				sum += nums[i];
			}
			
		}System.out.println("배열 중 짝수들의 합 = " + sum);

	}

}
