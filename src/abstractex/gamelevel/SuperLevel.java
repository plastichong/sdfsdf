package abstractex.gamelevel;

public class SuperLevel extends PlayerLevel {

    @Override
    void run() {
        System.out.println("매우 빠르게 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("매우 높이 jump 합니다");

    }

    @Override
    void turn() {
        System.out.println("한 바퀴 turn!");

    }

    @Override
    void showLevel() {
        System.out.println("SuperLevel입니다");
    }
}
