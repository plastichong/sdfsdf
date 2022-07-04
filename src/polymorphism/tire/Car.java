package polymorphism.tire;

import java.util.Timer;

public class Car {

    Tire frontLeftTire ;
//            = new Tire("앞왼쪽");
    Tire frontRightTire ;
//            = new Tire("앞오른쪽");
    Tire BackLeftTire ;
//            = new Tire("뒤왼쪽");
    Tire BackRightTire ;
//            = new Tire("뒤오른쪽");

    public Car(int maxRotation1,int maxRotation2,int maxRotation3,int maxRotation4){
         this.frontLeftTire = new Tire("앞왼쪽",maxRotation1);
         this.frontRightTire = new Tire("앞오른쪽",maxRotation2);
         this.BackLeftTire = new Tire("뒤왼쪽",maxRotation3);
         this.BackRightTire = new Tire("뒤오른쪽",maxRotation4);

    }

    public int run(){
        System.out.println("자동차가 달립니다");
        if(!frontLeftTire.roll()){stop(); return 1;}
        if(!frontRightTire.roll()){stop(); return 2;}
        if(!BackLeftTire.roll()){stop(); return 3;}
        if(!BackRightTire.roll()){stop(); return 4;}
        return 0;
    }


    void stop(){
        System.out.println("자동차가 멈춥니다");
    }
}
