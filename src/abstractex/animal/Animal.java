package abstractex.animal;

public abstract class Animal {
    String kind;

    void breath(){
        System.out.println("숨을 쉽니다.");
    }

    abstract void sound();
}
