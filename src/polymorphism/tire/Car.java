package polymorphism.tire;

import java.util.ArrayList;
import java.util.Timer;

public class Car {
    Tire frontLeftTire;
    Tire frontRightTire;
    Tire BackLeftTire;
    Tire BackRightTire;


    public Car(int maxRotation1, int maxRotation2, int maxRotation3, int maxRotation4) {
        this.frontLeftTire = new Tire("앞 왼쪽", maxRotation1);
        this.frontRightTire = new Tire("앞 오른쪽", maxRotation2);
        this.BackLeftTire = new Tire("뒤 왼쪽", maxRotation3);
        this.BackRightTire = new Tire("뒤 오른쪽", maxRotation4);

    }

    public int run() {
        System.out.println("[자동차가 달립니다]");
        tireCheck();
        if (!frontLeftTire.roll()) {stop();return 1;}
        if (!frontRightTire.roll()) {stop();return 2;}
        if (!BackLeftTire.roll()) {stop();return 3;}
        if (!BackRightTire.roll()) {stop();return 4;}
        return 0;
    }
     void tireCheck() {
         ArrayList<Tire> tires = new ArrayList<Tire>();
         tires.add(frontLeftTire);
         tires.add(frontRightTire);
         tires.add(BackLeftTire);
         tires.add(BackRightTire);
         for (int i = 0; i < tires.size(); i++) {
             if ((tires.get(i).maxRotation - tires.get(i).accumulatedRotation) == 1) {
                 System.out.println("!!" + tires.get(i).location + " 타이어수명: " + (tires.get(i).maxRotation - tires.get(i).accumulatedRotation) + "회!!");

             } else if (tires.get(i).accumulatedRotation < tires.get(i).maxRotation) {
                 System.out.println(tires.get(i).location + " 타이어수명: " + (tires.get(i).maxRotation - tires.get(i).accumulatedRotation) + "회");
             } else
                 System.out.println("*** " + tires.get(i).location + " 타이어 펑크!!***");
         }
     }


    void stop() {
        System.out.println("[자동차가 멈춥니다]");
    }
}
