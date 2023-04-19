package javapro.reference;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[][] nums = {
				{96,85,90},            //0
				{70,86,66,82,75}       //1
		};
		System.out.println(nums.length); // 2 = 0,1
		System.out.println(nums[0].length); //3 = 96, 85, 90
		System.out.println(nums[1].length); //5 = 70,86,66,82,75
		
		for(int i=0; i<nums.length; i++) {
			for(int d=0; d<nums[i].length; d++) {
				System.out.print(nums[i][d] + "  ");
			}System.out.println();
		} 

	}

}
