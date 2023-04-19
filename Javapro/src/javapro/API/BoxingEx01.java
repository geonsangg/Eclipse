package javapro.API;

public class BoxingEx01 {

	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1);

		// 박싱(번지-heap에 저장)
		Integer obj2 = 20;
		System.out.println(obj2.intValue());

		// 언박식(번지로 찾아가서 있는 값을 넘겨줌)
		int value = obj2;
		System.out.println(value);
		int result = obj2 + 30;
		System.out.println("결과값 = " + result);
		int num2 = 50;
		int num3 = 50;
		if (num2 == num3) {
			System.out.println("같은 값 입니다.");
		} else {
			System.out.println("다른 값 입니다.");
		}
		Integer num4 = new Integer(50);
		Integer num5 = new Integer(50);
		if (num4.equals(num5)) { // == 으로 할 경우 주소가 다르기때문에 다른값이라고 나옴.
			System.out.println("같은 값 입니다.");
		} else {
			System.out.println("다른 값 입니다.");
		}

	}
}
