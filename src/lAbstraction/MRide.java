package lAbstraction;

abstract class MRide {
	
	String vehicleNumber;
    String driverName;
    double baseFare;

    MRide(String vehicleNumber, String driverName, double baseFare) {
        this.vehicleNumber = vehicleNumber;
        this.driverName = driverName;
        this.baseFare = baseFare;
    }

    abstract double calculateFare(double distance);

    void displayRideDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Fare: ₹" + baseFare);
    }

}
