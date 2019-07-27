import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int capability;
    private int availableSpaceCount;
    private List<Car> parkingCars = new ArrayList<>();

    public ParkingLot(int capability) {
        this.capability = capability;
        this.availableSpaceCount = capability;
    }

    public String parkCar(Car car) {
        if (availableSpaceCount == 0) {
            return "Parking lot is full !";
        }
        parkingCars.add(car);
        availableSpaceCount = capability - parkingCars.size();
        return "Parking successful !";
    }

    public String getCar(Car car) {
        if(parkingCars.contains(car)) {
            availableSpaceCount++;
            return "Getting successful !";
        }
        return "Getting failed !";
    }
}
