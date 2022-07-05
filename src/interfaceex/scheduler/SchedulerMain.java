package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerMain {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 배분 방식을 선택하세요");
        System.out.println("R: 한명씩 차례로 배분");
        System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 배분");
        System.out.println("P: 우선 순위가 높은 고객이 먼저 할당");

        int ch = System.in.read();

        Scheduler sc = null;

        if (ch == 'R' || ch == 'r') {
            sc = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            sc = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            sc = new PriorityAllocation();
        }else{
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        sc.getNextCall();
        sc.sendCallToAgent();

    }
}
