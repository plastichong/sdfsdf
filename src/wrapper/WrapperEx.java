package wrapper;

import array.ArrayTest;

import java.util.ArrayList;

public class WrapperEx {
    public static void main(String[] args) {
        int n = 10;
        Integer num1 = 100; //
        int num2 = 200;
        int sum = num1.intValue() + num2;

        System.out.println(sum);


        Integer n1 = Integer.valueOf("300");
        System.out.println(n1);

        int n2 = Integer.parseInt("400");
        System.out.println(n2);

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(2);
        numList.add(3);

        for (Integer num : numList) {
            System.out.println(num);
        }







    }
}
