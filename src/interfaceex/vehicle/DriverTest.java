package interfaceex.vehicle;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver = new Driver();
//        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        Vehicle bus = new Bus();

//Bus 는 Vehicle 이니까... 그것이 다형성
//Bus is Vehicle...
        driver.drive(bus);
        driver.drive(taxi);
    }
}
