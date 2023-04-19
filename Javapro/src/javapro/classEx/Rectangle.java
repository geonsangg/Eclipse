package javapro.classEx;
//사각형 클래스
public class Rectangle {
	//필드
	private int width, height; //private = 캡슐화(접근 제한) 값을 변경 할 수 없게함.
	//생성자
	public Rectangle(int width, int height) throws Exception {
		if(width <= 0 || height <= 0) {
			throw new Exception("넓이와 높이는 플러스 값이어야 합니다.");
		}
		this.width = width;
		this.height = height;
	}
	//사각형 면적 메서드
	int getArea() {
		return width * height;
	}
	//getter
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}
	//setter를 사용하는 이유는 필드에는 대입문으로 바로 들어가서 잘못 된 값을 막을 수 없지만 메서드는 if문 등으로 막을 수 있기때문.
	public void setWidth(int width) {
		if(width > 0) {
		this.width = width;
		 }
	}
	public void setHeight(int height) {
		if(height > 0) {
		this.height = height;
		}
	}
	
}
