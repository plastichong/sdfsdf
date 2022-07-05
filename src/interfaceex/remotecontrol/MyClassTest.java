package interfaceex.remotecontrol;

public class MyClassTest {
    public static void main(String[] args) {
        RemoteControl rc = new Audio();

        MyClass mc1 = new MyClass(new Television());
        MyClass mc2 = new MyClass(rc);
        MyClass mc3 = new MyClass();

        mc1.rc.turnOn();
        mc2.rc.turnOn();


    }
}
