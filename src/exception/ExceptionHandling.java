package exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e);
//            throw new RuntimeException(e);
        }
    }
}
