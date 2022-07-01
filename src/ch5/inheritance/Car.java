package ch5.inheritance;


public class Car {
    String brand;
    int cc;

    public Car() {
    }

    ;

    public Car(String brand, int cc) {
        this.brand = brand;
        this.cc = cc;

    }

    ;

}

class Taxi extends Car {

    int passenger;

    public Taxi() {
    }

    ;

    public Taxi(String brand, int cc, int passenger) {
        super(brand, cc);
        this.passenger = passenger;

    }
}




