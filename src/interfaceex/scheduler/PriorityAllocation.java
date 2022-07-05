package interfaceex.scheduler;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담전화를 순서대로 대기열에서 가져오기");
    }

    @Override
    public void sendCallToAgent() {
System.out.println("업무 SKILL이 높은 상담원에게 우선 배분합니다.");
    }
}
