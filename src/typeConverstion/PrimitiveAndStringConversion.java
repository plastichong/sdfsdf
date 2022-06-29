package typeConverstion;

public class PrimitiveAndStringConversion {
    public static void main(String[] args) {
        int val1 = Integer.parseInt("10");
        double val2 = Double.parseDouble("3.14");
        boolean val3 = Boolean.parseBoolean("true");


        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(10.0);
        String str3 = String.valueOf(true);

        System.out.println(str1 instanceof String);
        System.out.println(str2 instanceof String);
        System.out.println(str3 instanceof String);
    }
}
