package reference;

public class TakeTest {
    public static void main(String[] args) {
        Bus bus = new Bus(950407);//Bus 의 인스턴스 bus생성
        Subway sub = new Subway("line2");
        Person person = new Person("위수영",1200);
        Person person2 = new Person("임준영",500000);


        person.takeBus(bus);
        person2.takeBus(bus);

        person.takeSubway(sub);
        person2.takeSubway(sub);


        sub.showInfo();
        bus.showInfo();

        System.out.println("===================");
        person.showInfo();
        person2.showInfo();

    }
}
