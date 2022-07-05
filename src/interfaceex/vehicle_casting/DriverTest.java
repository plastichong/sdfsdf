package interfaceex.vehicle_casting;

//import interfaceex.vehicle.Bus;
//import interfaceex.vehicle.Driver;
//import interfaceex.vehicle.Taxi;
//import protectedEx.pack1.B;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle bus = new Bus();

        if (bus instanceof Bus){
        Bus bus2 = (Bus)bus;
        bus2.checkFare();
        }

        driver.drive(bus);


//왜냐하면 Bus 는 Vehicle 이니까... 그것이 다형성
//Bus is a Vehicle...

    }
}
