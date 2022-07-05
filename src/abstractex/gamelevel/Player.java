package abstractex.gamelevel;

public class Player {
    private PlayerLevel level;

    public Player() {
        this.level = new Beginner();
        level.showLevel();
    }

    public void setLevel(PlayerLevel level) {
        this.level = level;
        level.showLevel();

    }

    public void callGo(int times) {level.go(times);}
}
