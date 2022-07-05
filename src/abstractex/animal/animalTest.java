package abstractex.animal;

public class animalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();

        System.out.println("===================");

        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();

        animalSound(animal);
    }

    private static void animalSound(Animal animal) {
    animal.sound();
    }


}
