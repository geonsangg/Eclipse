package javapro.classEx;

public class SingletonEx01 {

	public static void main(String[] args) {
		//싱글톤 = 객체1개임.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
