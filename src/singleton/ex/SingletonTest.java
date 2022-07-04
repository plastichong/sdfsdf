package singleton.ex;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        System.out.println((s == s1));
    }
}
