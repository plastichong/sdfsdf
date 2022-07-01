package example;

public class MainStringArrayArgument {
    public static void main(String[] args) {
//        if (args.length != 2){
//            System.out.println("값의 수가 부족합니다..");
//            System.exit(0);
//        }
        String str1 = args[0];
        String str2 = args[1];
        int num1 =  Integer.parseInt(str1);
        int num2 =  Integer.parseInt(str2);

        int result = num1+num2;

        System.out.println(result);

    }
}
