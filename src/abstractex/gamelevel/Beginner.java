package abstractex.gamelevel;

public class Beginner extends PlayerLevel {

    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("jump 할 줄 몰라요");

    }

    @Override
    void turn() {
        System.out.println("turn 할 줄 몰라요");

    }

    @Override
    void showLevel() {
        System.out.println("beginnerLevel입니다");
    }
}
