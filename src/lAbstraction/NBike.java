package lAbstraction;

public class NBike extends MRide{
	
	NBike(String vehicleNumber, String driverName, double baseFare) {
        super(vehicleNumber, driverName, baseFare);
    }

    @Override
    double calculateFare(double distance) {
        return baseFare + (distance * 8);
    }

}
