package interfaceex.tire;

import java.util.ArrayList;

public class Car {
    Tire frontLeftTire = new KumTire();
    Tire frontRightTire = new KumTire();
    Tire backLeftTire = new HanTire();
    Tire backRightTire = new HanTire();



    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
