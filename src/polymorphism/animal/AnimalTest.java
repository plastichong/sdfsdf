package polymorphism.animal;

import protectedEx.pack1.A;

import java.util.ArrayList;

public class AnimalTest {
    public static ArrayList<Animal> animalList = new ArrayList<Animal>();

    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();

        Animal human = new Human();
        Human human2 = (Human)human;
        Animal Eagle = new Eagle();
        Animal tiger = new Tiger();


//        aTest.moveAnimal(tiger);

        animalList.add(new Human());
        animalList.add(new Eagle());
        animalList.add(new Tiger());



        for (int i = 0; i < animalList.size() ; i++) {
                animalList.get(i).move();
        }
        aTest.testCasting(animalList);

    }
    public void testCasting(ArrayList<Animal> animalList){
    for (int i = 0; i < animalList.size() ; i++) {
        Animal animal = animalList.get(i);
        if(animal instanceof Human){
            Human human3 = (Human)animal;
            human3.readBook();
        }else if(animal instanceof Eagle){
            Eagle eagle3 = (Eagle) animal;
            eagle3.flying();
        }else if(animal instanceof Tiger){
            Tiger tiger3 = (Tiger)animal;
            tiger3.hunting();
        }
    }
    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }

}

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook(){
        System.out.println("책을 읽습니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying(){
        System.out.println("독수리가 날아갑니다");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }

}
