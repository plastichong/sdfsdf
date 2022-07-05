package abstractex.template;

public class AiCar extends Car{
    @Override
    void drive() {
        System.out.println("자율주행합니다");
        System.out.println("스스로 방향을 전환합니다");
    }

    @Override
    void stop() {
    System.out.println("자동으로 멉춥니다.");
    }

}
