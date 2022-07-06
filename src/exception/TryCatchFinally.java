package exception;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {


        String str = args[0];
        String str2 = args[1];

        int num1 = Integer.parseInt(str);
        int num2 = Integer.parseInt(str2);

        int result = num1+num2;
        System.out.println(str+"+"+str2+"="+result);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족합니다.");
        }catch (NumberFormatException e){
            System.out.println("숫자 포멧이 아닙니다.");
        }finally {
            System.out.println("다시 실행하세요");
        }




    }
}
