package interfaceex.tire;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.frontRightTire = new HanTire();
        car.frontLeftTire = new HanTire();
        car.run();


    }
}
