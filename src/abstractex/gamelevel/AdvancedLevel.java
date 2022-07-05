package abstractex.gamelevel;

public class AdvancedLevel extends PlayerLevel {

    @Override
    void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("높이 jump 합니다");

    }

    @Override
    void turn() {
        System.out.println("turn 할 줄 몰라요");

    }

    @Override
    void showLevel() {
        System.out.println("AdvancedLevel입니다");
    }
}
