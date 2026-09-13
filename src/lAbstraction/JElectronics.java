package lAbstraction;

public class JElectronics extends IProduct{

	JElectronics(int productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	double calculateDiscount() {
		return price*0.10;
	}

}
