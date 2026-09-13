package lAbstraction;

public class PCar extends MRide{
	
	PCar(String vehicleNumber, String driverName, double baseFare) {
        super(vehicleNumber, driverName, baseFare);
    }

    @Override
    double calculateFare(double distance) {
        return baseFare + (distance * 18);
    }

}
