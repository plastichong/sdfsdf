package nastedclass;

class Outer2{
    int outNum = 100;
    static int sNum = 200;

    Runnable runner = new Runnable() {
        int num = 10;
        @Override
        public void run() {
            System.out.println(outNum+"외부 인스턴스 변수");
            System.out.println(sNum+"외부 스태틱 변수");
            System.out.println(num+"익명 멤버 변수");
        }
    };
    Runnable runner2 = new Runnable() {
        int num = 10;
        @Override
        public void run() {
            System.out.println(outNum+"외부 인스턴스 변수");
            System.out.println(sNum+"외부 스태틱 변수");
            System.out.println(num+"익명 멤버 변수");
        }
    };


}

public class LocalInnerTest2{
    public static void main(String[] args) {
    Outer2 oc = new Outer2();
    oc.runner.run();
    System.out.println(oc.runner);
    System.out.println(oc.runner2);


    }


}
