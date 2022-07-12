package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> vegeList = new ArrayList<>();

        vegeList.add("양파");
        vegeList.add("마늘");
        vegeList.add("감자");

        vegeList.add(2,"고추");



        for (int i = 0; i < vegeList.size(); i++) {
            String vege = vegeList.get(i);
            System.out.println(vege);
        }
        System.out.println();
        System.out.println("//수정//");
        System.out.println();
        vegeList.set(0,"상추");

        for (String vege : vegeList){
            System.out.println(vege);
        }


        System.out.println(vegeList.size());

    }
}
