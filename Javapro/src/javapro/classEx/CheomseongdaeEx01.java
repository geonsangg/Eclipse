package javapro.classEx;

public class CheomseongdaeEx01 {

	public static void main(String[] args) {
		Cheomseongdae cheom1 = Cheomseongdae.getInstance();
		Cheomseongdae cheom2 = Cheomseongdae.getInstance();
		cheom1.showStar("건상");
		cheom2.showStar("리건");
		if (cheom1 == cheom2) {
			System.out.println("같은 객체(첨성대)입니다.");
		}
		else {
			System.out.println("다른 객체(첨성대)입니다.");
		}
	}

}
