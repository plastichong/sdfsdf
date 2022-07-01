package statics;

public class StudentTest {
    public static void main(String[] args) {
        Student wee = new Student();
        wee.setName("위수영");

        Student lim = new Student();
        lim.setName("임준영");

        Student.seriaNum ++;
        System.out.println(Student.seriaNum);
        System.out.println(wee.getName());

        Student.seriaNum ++;
        System.out.println(Student.seriaNum);
        System.out.println(lim.getName());
    }
}
