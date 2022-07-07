package annonymous.remotecontrol;

public class AnonymousTest {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.turnOn();
        anony.field.turnOff();

        anony.method1();
        anony.method2(new RemoteControl() {
            // RemoteControl 의 자식객체를 익명으로 만들고, method2 의 매개값으로 전달
            @Override
            public void turnOn() {
                System.out.println("tv를 켭니다");

            }

            @Override
            public void turnOff() {
                System.out.println("tv를 끕니다");

            }
        });

    }
}
