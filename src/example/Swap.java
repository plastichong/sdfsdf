package example;

public class Swap {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        int tmp;

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: "+x+"\ny: "+y);
    }
}
