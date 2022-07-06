package example;

public class Test8_1 {
    static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    };

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
