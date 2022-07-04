package polymorphism.taketrans;

public class Bus extends Vehicle {
    //Vehicle 클래스에서 기본생성자를 정의하지 않았음으로 생성자를 오버라이딩 해야함

    public Bus(String vehicleName) {
        super(vehicleName);
    }

}
