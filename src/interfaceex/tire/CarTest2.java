package interfaceex.tire;

public class CarTest2 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();

//        car2.frontRightTire = new HanTire();
//        car2.frontLeftTire = new HanTire();

        car2.tires[0] = new HanTire();
        car2.tires[1] = new HanTire();
        car2.run();


    }
}
