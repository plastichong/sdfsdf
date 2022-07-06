package nastedclass;

public class StudentTest {
    public static void main(String[] args) {
        Student wee = new Student("위수영");

        Student.Score score = wee.new Score(); //외부 클래스 객체를 통해 생성

        score.eng = 88;
        score.math = 60;
        score.showInfo();
    }
}
