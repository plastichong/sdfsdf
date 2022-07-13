package example;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int AH = A;
        int AM = B;

        if ((B + C) >= 60) {
            AM = (B + C);
            if(AM%60==0){
               AH += AM/60;
               AM = 0;
            }
            if(AM%60!=0&&AM>60){
               AM = AM-60;
               AH++;

            }
//
            if (AH >= 24) {
                AH = 0;
            }
            System.out.println(AH + " " + AM);
        }else {
            System.out.println(AH + " " + (AM+C));
        }


    }
}
