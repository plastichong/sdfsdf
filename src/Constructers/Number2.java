package Constructers;

public class Number2 {

    int x;
    public Number2(int y){
        x = y;
    }

    public static void main(String[] args) {
        Number2 num = new Number2(2);
        System.out.println(num.x);
    }
}
