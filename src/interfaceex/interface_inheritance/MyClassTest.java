package interfaceex.interface_inheritance;

public class MyClassTest {
    public static void main(String[] args) {

        MyClass c = new MyClass();
        X x = c;
        x.x();
        MyInterface my = c;
        my.myMethod();
        c.x();
        c.y();
        c.myMethod();
    }
}
