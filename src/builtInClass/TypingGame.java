package builtInClass;

import java.util.Scanner;

public class TypingGame {
    public static void main(String[] args) {
        String[] word = {"river","moutain","sky","erth","moon","tree","flower","cow","pig","horse"};
        int n = 1;
        long start;
        long end;
        Scanner sc = new Scanner(System.in);

        System.out.println("영어타자 게임, 준비되면 엔터");
        sc.nextLine();
        start = System.currentTimeMillis();
        while (n<11){
            int rand = (int)(Math.random()* word.length);
            System.out.println("문제"+n);
            String question = word[rand];
            System.out.println(question);

            String answer = sc.nextLine();
            if(answer.equals(question)){
                System.out.println("통과!");
                n++;
            }else{
                System.out.println("오타! 다시 도전!");
            }
        }
        end = System.currentTimeMillis();
        System.out.println("게임 소요시간은 "+(end-start)/1000+"초 입니다");
        sc.close();
    }
}
