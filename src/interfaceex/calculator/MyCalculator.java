package interfaceex.calculator;

public class MyCalculator implements Calculator {

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int times(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int divide(int n1, int n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            return 0;
        }
    }

    static MyCalculator myC = new MyCalculator();

    public static void main(String[] args) {

        System.out.println(MyCalculator.myC.add(1, 5));
        System.out.println(MyCalculator.myC.divide(1, 0));
    }
}
