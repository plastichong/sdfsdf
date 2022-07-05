package abstractex.template;

public class ManualCar extends Car{

    @Override
    void drive() {
        System.out.println("사람이 운전합니다");
        System.out.println("사람이 핸들을 조작합니다");
    }

    @Override
    void stop() {
    System.out.println("브레이크를 밟습니다");
    }

}
