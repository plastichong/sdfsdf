package example;

    class Car{
        class Tire{Tire(){System.out.println("Tire 객체 생성");}}
        static class Engine{Engine(){System.out.println("Engine 객체 생성");}}

    }


public class Test9_1 {
    //1. o o o x
    //2. o o x o
    public static void main(String[] args) {

        Car car = new Car();

        Car.Tire tire = car.new Tire();
        Car.Engine engine = new Car.Engine();



    }

}
