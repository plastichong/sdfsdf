package baekjoon;

import java.io.*;

public class FastFor {
    public static void main(String[] args) {


        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
            for (int i = 1; i <= T; i++) {
                String[] strs = br.readLine().split(" ");
                int A = Integer.parseInt(strs[0]);
                int B = Integer.parseInt(strs[1]);
                bw.write(A+B+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
