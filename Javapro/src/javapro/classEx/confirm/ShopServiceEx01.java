package javapro.classEx.confirm;

public class ShopServiceEx01 {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInsstance();
		ShopService obj2 = ShopService.getInsstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}

}
