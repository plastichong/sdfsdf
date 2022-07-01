package example;

public class ThisConstructor {

    String name;
    String color;
    int maxSpeed;

    ThisConstructor() {
        this("kim", "silver", 250);
    }

    ;

    ThisConstructor(String name) {
        this(name, "silver", 250);
    }

    ThisConstructor(String name, String color) {
        this(name, color, 250);
    }

    ThisConstructor(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void showInfo() {
        System.out.println(name + ", " + color + ", " + maxSpeed);

    }


}
