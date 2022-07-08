package object;

public class CircleMain {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        System.out.println(point.toString());

        Circle circle = new Circle(5, 6, 4);
        System.out.println(circle.toString());
        System.out.println();

        //circle 객체 복사
        System.out.println("circle 복사");
        try {

            Circle copyCircle = (Circle) circle.clone();

            System.out.println(copyCircle.toString());

        } catch (CloneNotSupportedException e) {
        }


    }
}
