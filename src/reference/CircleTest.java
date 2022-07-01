package reference;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(1,2,10);
        Circle c2 = new Circle(5,8,20);

        System.out.println(c.showInfo());
        System.out.println(c2.showInfo());
    }
}
