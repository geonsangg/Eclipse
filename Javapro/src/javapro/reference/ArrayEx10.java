package javapro.reference;

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] oldNums = {10,51,23};
		int[] newNums = new int[5];
		// newNums = oldNums; 이건 값이 복사가 된것이 아니라 번지가 복사된것.
		
		for(int i=0; i<oldNums.length; i++) {
			System.out.print(oldNums[i] + "  ");
			newNums[i] = oldNums[i]; 
		}
		System.out.println();
		
		for(int i=0; i<newNums.length; i++) {
			System.out.print(newNums[i] + "  ");
		}
	}

}
