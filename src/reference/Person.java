package reference;

public class Person {
    String name;
    int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }
    public void takeBus(Bus bus){//bus 객체를 인자로 받음
        if(money<1200){
        System.out.println(this.name+"님이 bus에 탑승합니다.");
            System.out.println(this.name+"! 잔액이 부족합니다.");
        }else {
        bus.take(1200);     // 인자로 받은 bus 객체의 take 메서드 사용
        System.out.println(this.name+"님이 bus에 탑승합니다.");
        this.money -= 1200;
        }
    }

    public void takeSubway(Subway sub){//subway 객체를 인자로 받음
        if(money<1200){
            System.out.println(this.name + "님이 subway에 탑승합니다.");
            System.out.println(this.name+"! 잔액이 부족합니다.");
        }else {
            sub.take(1200);     // 인자로 받은 bus 객체의 take 메서드 사용
            System.out.println(this.name + "님이 subway에 탑승합니다.");
            this.money -= 1200;
        }
    }


    public void showInfo(){
        System.out.println("이름 : "+this.name);
        System.out.println("소유 금액 : "+this.money);
    }
}
