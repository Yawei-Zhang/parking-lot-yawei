import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test
    public void shouldReturnParkingSuccessfulWhenParkingACarGivenAParkingLotWithOneAvailableSpaceAndACar() {
        //Given
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();

        //When
        String result = parkingLot.parkCar(car);

        //Then
        assertEquals("Parking successful !", result);
    }

    @Test
    public void shouldReturnParkingLotIsFullWhenParkingACarGivenAParkingLotWithNoneAvailableSpaceAndACar() {
        //Given
        ParkingLot parkingLot = new ParkingLot(1);
        Car carA = new Car();
        parkingLot.parkCar(carA);
        Car carB = new Car();

        //When
        String result = parkingLot.parkCar(carB);

        //Then
        assertEquals("Parking lot is full !", result);
    }

    @Test
    public void shouldReturnGettingSuccessfulWhenGettingACarFromParkingLotGivenAParkingLotWithTheCar() {
        //Given
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        parkingLot.parkCar(car);

        //When
        String result = parkingLot.getCar(car);

        //Then
        assertEquals("Getting successful !", result);
    }

    @Test
    public void shouldReturnGettingFailedWhenGettingACarFromParkingLotGivenAParkingLotWithoutTheCar() {
        //Given
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();

        //When
        String result = parkingLot.getCar(car);

        //Then
        assertEquals("Getting failed !", result);
    }
}
