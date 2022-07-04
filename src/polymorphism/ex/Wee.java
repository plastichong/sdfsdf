package polymorphism.ex;

public class Wee {
    String name;
    int age;
    int debt = 1200000;

    public Wee() {
        this.name = "위수영";
        this.age = 28;
    }

    public void debtCheck() {
        System.out.printf("우끾! %s의 빚은 %,d원 입니다\n", this.name, this.debt);

    }

    public static void main(String[] args) {
        MonkeyWee wee = new MonkeyWee();
        wee.debtCheck();
        HumanWee humanWee = new HumanWee();
        humanWee.debtCheck();

    }


}

class HumanWee extends Wee {
    public HumanWee() {
        this.name = "위수영";
        this.age = 28;
        this.debt = 0;
    }

    public void debtCheck() {

        System.out.printf("%s의 빚은 %,d원 입니다\n", this.name, this.debt);

    }

}

class MonkeyWee extends Wee {
//    int debt = 1200000;

    public MonkeyWee() {
        super();
    }
}
