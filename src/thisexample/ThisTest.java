package thisexample;

class BirthDay{
    int year;
    int month;
    int day;

    public void setYear(int year) {
        this.year = year;
    }
    public void printThis(){
        System.out.println(this);
    }

}

public class ThisTest {

    public static void main(String[] args) {

    BirthDay b = new BirthDay();
    BirthDay b2 = new BirthDay();
    b.setYear(2022);
    System.out.println(b);
    b.printThis();

    System.out.println(b2);
    b2.printThis();


    }
}
