package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] strarr = br.readLine().split(" ");


            int A = Integer.parseInt(strarr[0]);
            int B = Integer.parseInt(strarr[1]);
            if (A + B != 0) {
                System.out.println(A + B);
            }
        }


    }
}
