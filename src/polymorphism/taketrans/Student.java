package polymorphism.taketrans;

public class Student {
    String name;
    int money;

    Student(String name, int money) {
        this.name = name;
        this.money = money;

    }

    //차량 탑승 매개변수의 다형성 이용
    public void take(Vehicle vehicle, int fee) {
        vehicle.carry(fee);
        this.money -= fee;
        System.out.printf("%s이 %d원을 내고 %s에 탑승합니다\n",this.name,fee,vehicle.vehicleName);
    }

    public void showInfo() {
        System.out.printf("%s의 남은 돈은 %d원 입니다.\n", this.name, this.money);
    }


}
