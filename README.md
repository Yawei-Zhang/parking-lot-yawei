#Parking lot

##Tasking

1. shouldReturnParkingSuccessfulWhenParkingACarGivenAParkingLotWithOneAvailableSpaceAndACar
    ```
    Given a parking lot with one available space and a car
    When park the car
    Then return “Parking Successful”
1. shouldReturnParkingLotIsFullWhenParkingACarGivenAParkingLotWithNoneAvailableSpaceAndACar
    ```
    Given a parking lot with none available space and a car 
    When park the car
    Then return “Parking lot is full”
1. shouldReturnGettingSuccessfulWhenGettingACarFromParkingLotGivenAParkingLotWithTheCar
    ```
    Given a parking lot with a car
    When get the car
    Then return “Getting Successful”
1. shouldReturnGettingFailedWhenGettingACarFromParkingLotGivenAParkingLotWithoutTheCar
    ```
    Given a car, a parking lot without the car
    When get the car
    Then return “Getting Failed”
1. shouldReturnGettingFailedWhenGettingACarFromParkingLotGivenAParkingLotWithAnotherCar
    ```
    Given a parking lot, a car B not parking, a car A parking in the parking lot
    When get the car B
    Then return “Getting Failed”
1. shouldReturnParkingFailedWhenParkingACarGivenAParkingLotWithAnotherCarParkingOnTheOnlySpace
    ```
    Given a parking lot with one space, two car carA parking in the parking lot, and carB
    When park carB
    Then return “Parking Failed !” 
