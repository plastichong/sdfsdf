package example;

import java.util.ArrayList;

public class GenericEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("grape");
        list.add("egg");
        list.add("coffee");

        System.out.println(list);
        System.out.println(list.get(2));

        ArrayList cart = new ArrayList();
        cart.add(123);
        cart.add("포도");
        cart.add(3.14159);


        System.out.println(cart);
    }
}
