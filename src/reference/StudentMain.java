package reference;

public class StudentMain {
    public static void main(String[] args) {
        Student wee = new Student(1234,"위수영");


        wee.mathSubject("수학",30);
        wee.koreanSubject("국어",40);

        wee.showInfo();
    }
}
