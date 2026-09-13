package lAbstraction;

public class KClothing extends IProduct{

	KClothing(int productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	double calculateDiscount() {
		return price * 0.20;
	}

}
