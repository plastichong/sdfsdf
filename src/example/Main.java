package example;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int AH = A;
            int AM = B;

            if ((B + C) >= 60) {

                AM = (B + C);

                if (AM % 60 == 0) {
                    AH += AM / 60;
                    AM = AM%60;
                    if (AH >= 24) {
                        AH -= 24;
                    }
                }
                if (AM % 60 != 0) {
                    AM = AM % 60;
                    AH += AM / 60;
                    if (AH >= 24) {
                        AH -= 24;
                    }
                }
                System.out.println(AH + " " + AM);
            } else {
                System.out.println(AH + " " + (AM + C));
            }
        }
    }
}
