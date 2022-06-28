package array;

class Animal{
    String name;

    public void setName(String name) {
      this.name = name;


    }

}

public class Sample {
    public static void main(String[] args) {
    Animal cat = new Animal();
    Animal dog = new Animal();
    dog.setName("happy");
    cat.setName("boby");
    System.out.println(cat.name);
    System.out.println(dog.name);
    }

}
