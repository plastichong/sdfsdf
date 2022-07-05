package interfaceex.scheduler;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담전화를 순서대로 대기열에서 가져오기");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담업무가 없거나 대기가 가장 적은 상담원에게 배분");
    }
}