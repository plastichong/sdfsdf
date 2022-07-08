package example;

import java.util.Scanner;

public class Main {

    static int taiYearToKoYear(int taiY) {
        return taiY - 543;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int taiY = sc.nextInt();

        System.out.println(taiYearToKoYear(taiY));
    }
}
