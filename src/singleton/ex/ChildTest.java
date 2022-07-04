package singleton.ex;

public class ChildTest {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = c;
        Child c2 = (Child)p;

        c.method1();
        c.method2();
        c.method3();

        p.method1();
        p.method2();
        c2.method3();

//        c2.method2();
    }
}
