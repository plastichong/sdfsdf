package thread;

public class BeepPrintTest2 {
    public static void main(String[] args) {
        //메인 쓰레드와 작업 쓰레드가 동시에 실행

        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("beep");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
