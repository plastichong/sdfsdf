package builtInClass;

public class MathEx {
    public static void main(String[] args) {
        int v1 = Math.abs(-10);
        System.out.println(v1);

        long v2 = Math.round(5.6);
        System.out.println(v2);

        double v3 = Math.floor(5.9);
        System.out.println(v3);

        int max = Math.max(10,-10);
        System.out.println(max);

        double rand = Math.random();
        System.out.println((int)(rand*10)+1);

        int dice = (int)(Math.random()*6)+1;
        System.out.println(dice);
    }
}
