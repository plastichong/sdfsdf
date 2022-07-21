package baekjoon;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int money = 0;

        if(dice1 == dice2 && dice1 == dice3){
            money = 10000+(dice1*1000);
        } else if (dice1 == dice2 || dice1 == dice3) {
            money = 1000+(dice1*100);
        } else if (dice2 == dice3) {
            money = 1000+(dice2*100);
        } else {
            int[] arr = {dice1,dice2,dice3};
            int max = arr[0];
            for (int i = 0; i < arr.length ; i++) {
                if(max<arr[i]){
               max = arr[i];
                }
            }
            money = max*100;
        }
        System.out.println(money);
    }
}
