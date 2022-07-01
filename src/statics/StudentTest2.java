package statics;

public class StudentTest2 {
    public static void main(String[] args) {

        Student2 wee = new Student2();
        Student2 lim = new Student2();

        wee.setName("위수영");
        lim.setName("임준영");

        System.out.println("이름 "+wee.getName());
        System.out.println("이름 "+wee.getId());

        System.out.println("이름 "+lim.getName());
        System.out.println("이름 "+lim.getId());
    }
}
