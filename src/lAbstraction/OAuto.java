package lAbstraction;

public class OAuto extends MRide{
	
	OAuto(String vehicleNumber, String driverName, double baseFare) {
        super(vehicleNumber, driverName, baseFare);
    }

    @Override
    double calculateFare(double distance) {
        return baseFare + (distance * 12);
    }

}
