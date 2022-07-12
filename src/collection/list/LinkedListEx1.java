package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {
    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list2.add("A");
        list2.add("B");
        list2.add("C");

        System.out.println(list2);

        list2.add(2,"D");
        System.out.println(list2);
    }
}
