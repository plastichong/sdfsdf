package baekjoon;

import java.util.Scanner;

public class LessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        StringBuilder A = new StringBuilder();

        int[]arr = new int[N];

        for (int i = 0; i <arr.length ; i++) {
            int R = sc.nextInt();
            arr[i] = R;
        }

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<X){
            A.append(arr[i]+" ");
            }
        }
        System.out.println(A);
    }
}
