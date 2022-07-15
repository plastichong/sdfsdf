package thread;

public class ThreadNameEx {
    public static void main(String[] args) {
        // 작업스레드 만든 방법

        //1 thread 객체 생성시 Runnable인터페이스 구현체를 매개로 전달
//        Thread 클래스 상속

        Thread mainTread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름 : "+mainTread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("프로그램 시작 스레드 이름 : "+threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB();
        System.out.println("프로그램 시작 스레드 이름 : "+threadB.getName());
        threadB.start();
    }
}
