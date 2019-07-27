public class ParkingLot {
    private final int capability;
    private int availableSpaceCount;

    public ParkingLot(int capability) {
        this.capability = capability;
        this.availableSpaceCount = capability;
    }

    public String parkCar(Car car) {
        if (availableSpaceCount == 0) {
            return "Parking lot is full !";
        }
        availableSpaceCount--;
        return "Parking Successful !";
    }
}
