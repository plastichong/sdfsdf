package example;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if ((M - 45) < 0) {
            H--;
            int resultM = (M - 45);
            M = 60;
            M = M - Math.abs(resultM);
            if (H < 0) {
                H = 23;

            }
            System.out.println(H + " " + M);
        }else {
            System.out.println(H + " " + (M-45));
        }


    }
}
