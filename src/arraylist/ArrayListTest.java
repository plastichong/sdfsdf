package arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("커피");
        myList.add("우유");
        myList.add("카레");

        System.out.println("장바구니 목록 수 : " + myList.size());
//        System.out.println(myList.get(2));

        for (int i = 0; i < myList.size(); i++) {
            String c = myList.get(i);
//            System.out.println(c);
            System.out.println(myList.get(i));
        }
        System.out.println();
        System.out.println("구분선============");
        System.out.println();

        myList.remove(0);
        System.out.println("장바구니 목록 수 : " + myList.size());



    }
}
