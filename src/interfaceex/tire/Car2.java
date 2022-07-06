package interfaceex.tire;

import java.util.ArrayList;

public class Car2 {





    Tire[] tires = {
            new KumTire(),
            new KumTire(),
            new HanTire(),
            new HanTire()

    };

    ArrayList<Tire[]> tireList = new ArrayList<>();

    //    ArrayList<Tire> Tires = new ArrayList<Tire>();


    void run(){
        for (int i = 0; i <tires.length ; i++) {
            tires[i].roll();


        }
    }
}
