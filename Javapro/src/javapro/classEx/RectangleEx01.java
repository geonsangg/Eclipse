package javapro.classEx;

public class RectangleEx01 {

	public static void main(String[] args) {
		try {
			Rectangle rect1 = new Rectangle(20, 30);
			rect1.setWidth(15);
			int area = rect1.getArea(); // 메서드 호출
			/* width,height가 캡슐화로 인해 접근이 안돼서 오류가뜸.
			 * System.out.println("사각형의 넓이 = " + rect1.width); //필드 호출
			 * System.out.println("사각형의 높이 = " + rect1.height);//필드 호출 */
			
			//↓ getter로 넓이,높이 값은 변경하지 않지만 출력은 할 수 있게 함. 
			System.out.println("사각형의 넓이 = " + rect1.getWidth());
			 System.out.println("사각형의 높이 = " + rect1.getHeight());
			System.out.println("사각형의 면적 = " + area);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
