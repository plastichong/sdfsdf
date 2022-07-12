package generic.box;

import protectedEx.pack1.A;

public class GenericBoxTest {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setType("행운을 빌어요!");
        String msg = box1.getType();
        System.out.println(msg);

        Box<Integer> box2 = new Box<>();
        box2.setType(10);
        Integer num = box2.getType();
        System.out.println(num);

        Box<Apple> box3 = new Box<>();
        box3.setType(new Apple("사과"));
        Apple apple = box3.getType();
        System.out.println(apple);
    }
}
