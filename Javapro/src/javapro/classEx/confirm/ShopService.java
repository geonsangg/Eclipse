package javapro.classEx.confirm;

public class ShopService {
	private static ShopService shop = new ShopService();

	private ShopService() {

	}

	static ShopService getInsstance() {
		return shop;
	}
}
