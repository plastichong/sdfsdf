package nastedclass;

class Outer{
    int outNum = 100;
    static int sNum = 200;


    Runnable getRunnable(){
        int num = 10;

        class MyRunnable implements Runnable{
            int localNum = 20;

            public void run(){
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }

        return new MyRunnable();
    }
}

public class LocalInnerTest{
    public static void main(String[] args) {
    Outer oc = new Outer();

    oc.getRunnable().run();


    }


}
