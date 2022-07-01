package singleton.car;

public class CarFactoryMain {
    public static void main(String[] args) {
    CarFactory factory = CarFactory.getInstance();
    CarFactory factory2 = CarFactory.getInstance();
    Car myAvante = factory.newCar();
    Car weeBenz = factory.newCar();

    System.out.println(myAvante.getCarNum());
    System.out.println(weeBenz.getCarNum());

    System.out.println(factory);
    System.out.println(factory2);
    }
}
