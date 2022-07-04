package polymorphism.taketrans;

public class TakeTrans {
    public static void main(String[] args) {
        Student wee = new Student("위수영", 50000);
        Student lim = new Student("임준영",20000);
        Vehicle bus = new Bus("버스");
        Vehicle subway = new Subway("지하철");
        Vehicle taxi = new Vehicle("택시");

        wee.take(bus, 1000);
        wee.take(bus,1000);
        wee.take(subway, 1500);
        wee.take(taxi,5000);


        System.out.println("==================");

        bus.showInfo();
        taxi.showInfo();
        subway.showInfo();
        wee.showInfo();

    }
}
