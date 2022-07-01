package example;

public class ThisConstructorTest {
    public static void main(String[] args) {
        ThisConstructor thisTest = new ThisConstructor();
        ThisConstructor thisTest2 = new ThisConstructor("wee");
        ThisConstructor thisTest3 = new ThisConstructor("wee","gold");
        ThisConstructor thisTest4 = new ThisConstructor("wee","gold",500);
        thisTest.showInfo();
        thisTest2.showInfo();
        thisTest3.showInfo();
        thisTest4.showInfo();

    }
}
