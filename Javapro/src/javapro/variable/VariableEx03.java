package javapro.variable;

public class VariableEx03 {

	public static void main(String[] args) {
		int x = 50;
		int y = 30;
		int temp ;
		//스왑 방법 변수 값 2개를 서로 바꾸려면 변수 한개가 더 필요하다.
		temp = x;
		x=y;
		y=temp;
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);

	}

}
