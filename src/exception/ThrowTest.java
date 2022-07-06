package exception;

class ArrayUtil{
    public void call() throws Exception{
        System.out.println("call메서드 시작");
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 1;
//        arr[2] = 1;
        System.out.println("call메서드 종료");
    }
}

public class ThrowTest {
    public static void main(String[] args) {

        ArrayUtil util = new ArrayUtil();
        try {
        util.call();
        System.out.println("Hello");
        }catch (Exception e){
            System.out.println("예외처리");
        }
        System.out.println("World");



    }
}
