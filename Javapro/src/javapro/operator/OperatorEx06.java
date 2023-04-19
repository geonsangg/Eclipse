package javapro.operator;

public class OperatorEx06 {

	public static void main(String[] args) {
		/* byte = -128 ~ 127
		 * 2진수 : -128 (1000 0000) ~ 127 (0111 1111)
		 ↓예시 = (0111 1111) + (0000 0001) = (1000 0000)
		        (1000 0000) + (0000 0001) = (1000 0001)
		byte value = 127;
		value++;
		System.out.println(value); <- -128
		value++;
		System.out.println(value); <- -127 */
		
		byte value = -128;
		value--;
		System.out.println(value);
		
	}

}
