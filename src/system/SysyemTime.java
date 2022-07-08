package system;

public class SysyemTime {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
//        long start = System.nanoTime();


        int sum = 0 ;

        for (int i = 0; i <1000000 ; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
//        long end = System.nanoTime();

        System.out.println("start : "+start);
        System.out.println("end : "+end);
        System.out.println("소요시간 : "+(end-start)+" 밀리초");
//        System.out.println("소요시간 : "+(end-start)+" 나노초");
    }

    
}
