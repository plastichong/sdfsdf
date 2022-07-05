package abstractex.gamelevel;

public class PlayerTest {
    public static void main(String[] args) {

    Player player = new Player();
    player.callGo(1);
    System.out.println("==================");

    player.setLevel(new AdvancedLevel());
    player.callGo(2);
    System.out.println("==================");

    player.setLevel(new SuperLevel());
    player.callGo(3);
    System.out.println("==================");
    }
}
