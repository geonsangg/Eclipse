package javapro.reference;

public class ArrayEx06 {

	public static void main(String[] args) {
		int[] nums = { 45, 17, 3, 78, 50 };
		int temp;
		// 소트전
		System.out.println("** 소트 전 출력 **");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		// 소트 알고리즘
		for (int a = 0; a < nums.length - 1; a++) {
			for (int b = a + 1; b < nums.length; b++) {
				if (nums[a] > nums[b]) { // 내림차순으로 하고싶으면 > 를 <로 바꿔주면 됨.
					temp = nums[a];
					nums[a] = nums[b];
					nums[b] = temp;

				}

			}
		}

		// 소트후
		System.out.println("** 소트 후 출력 **");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
