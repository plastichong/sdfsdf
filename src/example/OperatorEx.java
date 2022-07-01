package example;

import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 3;
        int var3 = 14;
        String var4 = String.valueOf(var2) + "." + String.valueOf(var3);
        double var5 = Double.parseDouble(var4) * var1 * var1;
        System.out.println(var5);


        //11
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디 :");
        String name = sc.nextLine();

        System.out.print("비밀번호 :");
        String strPassWord = sc.nextLine();
        int passWord = Integer.parseInt(strPassWord);

        if (name.equals("java")) {
            if (passWord == 12345) {
                System.out.println("로그인성공");
            } else {
                System.out.println("비밀번호 오류");
            }
        } else {
            System.out.println("아이디 오류");
        }
        sc.close();



        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);

    }
}
