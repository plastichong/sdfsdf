package exception;

public class ExceptionExample1 {

    public static void main(String[] args) {
    String data = "Asdf";
    System.out.println(data.toString());


try {

    int [] arr = new int[2];

    arr[2] = 1;
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("배열범위를 벗어났습니다");
}finally {
    System.out.println("done.");
}



    String str = "1234";
    String str2 = "a1234";
try {
    int num1 = Integer.parseInt(str);
    System.out.println(num1);
    int num2 = Integer.parseInt(str2);
}catch (NumberFormatException e){
    System.out.println("숫자포멧이 아닙니다");
}




    }

}
