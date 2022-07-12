package generic.box2;

import generic.box.Apple;

public class GenericBoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj("hello!");

        String msg = (String) box.getObj();
        System.out.println(msg);

        box.setObj(new Apple("사과"));
        Apple apple = (Apple) box.getObj();
        System.out.println(apple.toString());

    }
}
