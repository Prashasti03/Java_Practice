package lAbstraction;

public class LGrocery extends IProduct{

	LGrocery(int productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	double calculateDiscount() {
		return price * 0.05;
	}

}
