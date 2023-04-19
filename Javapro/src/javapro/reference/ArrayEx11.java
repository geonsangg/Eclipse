package javapro.reference;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[] oldNums = {10,51,23};
		int[] newNums = new int[5];
		System.arraycopy(oldNums, 0, newNums, 0, oldNums.length); // oldNums(의), 0(번째 부터), newNums(의), 0(번째 에다가), oldNums.length(만큼) 복사한다.
		for(int i=0; i<newNums.length; i++) {
			System.out.print(newNums[i] + "  ");
		}
	}

}
