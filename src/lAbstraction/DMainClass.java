package lAbstraction;

public class DMainClass {

	public static void main(String[] args) {
		
//		AVehicle v1 = new AVehicle();   // ERROR
		AVehicle v1 = new BTiago();
		v1.speed();
		v1.noOfTyres();
		
		AVehicle v2 = new CTigor();
		v2.speed();
		v2.noOfTyres();
		
		BTiago v3 = new BTiago();
		v3.speed();
		v3.noOfTyres();
		
		CTigor v4 = new CTigor();
		v4.speed();
		v4.noOfTyres();
		
		System.out.println();
		System.out.println("============== Payment Example Started =======================");
		System.out.println();
		
		EPayment p1 = new FCreditCardPayment();
		p1.pay();
		EPayment p2 = new GUPIPayment();
		p2.pay();
		EPayment p3 = new HCashPayment();
		p3.pay();
		
		System.out.println();
		System.out.println("============== Ecommerce Example Started =======================");
		System.out.println();
		
		IProduct pr1 = new JElectronics(101, "Laptop", 60000);
        IProduct pr2 = new KClothing(102, "Jacket", 3000);
        IProduct pr3 = new LGrocery(103, "Rice", 1000);

        pr1.displayProduct();
        System.out.println("Discount: ₹" + pr1.calculateDiscount());
        System.out.println("Final Price: ₹" +
                (pr1.price - pr1.calculateDiscount()));

        System.out.println();

        pr2.displayProduct();
        System.out.println("Discount: ₹" + pr2.calculateDiscount());
        System.out.println("Final Price: ₹" +
                (pr2.price - pr2.calculateDiscount()));

        System.out.println();

        pr3.displayProduct();
        System.out.println("Discount: ₹" + pr3.calculateDiscount());
        System.out.println("Final Price: ₹" +
                (pr3.price - pr3.calculateDiscount()));
        
        System.out.println();
		System.out.println("============== RideBooking Example Started =======================");
		System.out.println();
		
		double distance = 10;

        // Polymorphism
        MRide r1 = new NBike("MH12AB1234", "Rahul", 30);
        MRide r2 = new OAuto("MH12CD5678", "Amit", 40);
        MRide r3 = new PCar("MH12EF9012", "Suresh", 60);

        System.out.println("----- BIKE RIDE -----");
        r1.displayRideDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + r1.calculateFare(distance));

        System.out.println();

        System.out.println("----- AUTO RIDE -----");
        r2.displayRideDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + r2.calculateFare(distance));

        System.out.println();

        System.out.println("----- CAR RIDE -----");
        r3.displayRideDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + r3.calculateFare(distance));

	}

}
