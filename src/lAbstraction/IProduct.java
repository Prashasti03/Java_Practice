package lAbstraction;

abstract class IProduct {
	
	 int productId;
	    String name;
	    double price;

	    IProduct(int productId, String name, double price) {
	        this.productId = productId;
	        this.name = name;
	        this.price = price;
	    }

	    abstract double calculateDiscount();

	    void displayProduct() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Name: " + name);
	        System.out.println("Price: ₹" + price);
	    }

}
