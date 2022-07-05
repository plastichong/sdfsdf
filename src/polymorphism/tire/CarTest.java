package polymorphism.tire;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(5, 2, 4, 3);
        for (int i = 0; i < 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {

                case 1:
                    System.out.println("앞 왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new KumhoTire("앞 왼쪽", 10);
                    break;
                case 2:
                    System.out.println("앞 오른쪽 HankookTire로 교체");
                    car.frontRightTire = new KumhoTire("앞 오른쪽", 10);
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 HankookTire로 교체");
                    car.BackLeftTire = new KumhoTire("앞 왼쪽", 10);
                    break;
                case 4:
                    System.out.println("뒤 오른쪽 HankookTire로 교체");
                    car.BackRightTire = new KumhoTire("앞 오른쪽", 10);
                    break;
            }
            System.out.println("================================");

        }


    }
}
