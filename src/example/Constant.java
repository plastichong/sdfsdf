package example;

public class Constant {
    int num = 10;
    static final String NUM = "100";

    public static void main(String[] args) {
        Constant c = new Constant();
        c.num = 20;
        System.out.println(Integer.parseInt(Constant.NUM)+100);
    }
}
