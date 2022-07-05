package abstractex.car;

public abstract class Car {

    public abstract void run();

    public abstract void reFuel();

    public void stop() {
        System.out.println("차가 멈춥니다");
    }
}
