package thread;

public class ThreadB extends Thread{

    @Override
    public void run() {
        System.out.println(getName()+"가 출력한 내용");
    }


}
