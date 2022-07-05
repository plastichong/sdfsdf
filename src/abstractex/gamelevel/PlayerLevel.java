package abstractex.gamelevel;

public abstract class PlayerLevel {
    abstract void run();

    abstract void jump();

    abstract void turn();

    abstract void showLevel();

    final void go(int times) {
        run();
        for (int i = 1; i <= times; i++) {
            jump();
        }
        turn();
    }
}
