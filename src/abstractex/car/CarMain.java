package abstractex.car;

public class CarMain {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.reFuel();
        bus.takePassenger();
        bus.stop();

        System.out.println("==============");
        
        Truck truck = new Truck();
        truck.run();
        truck.reFuel();
        truck.load();
        truck.stop();
    }
}
