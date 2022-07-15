package thread;

public class ThreadA  extends Thread{

    @Override
    public void run() {
        System.out.println(getName()+"가 출력한 내용");
    }

    public ThreadA(){ //부모(Thread)가 가진 필드(String name) 초기화 메서드
        setName("ThreadA");
    }

}
