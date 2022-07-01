package arraylist;

public class StudentMain {
    public static void main(String[] args) {
        Student wee = new Student(1234,"위수영");
        wee.addSubject("국어",10);
        wee.addSubject("수학",5);
        wee.showStudentInfo();

        Student son = new Student(1111,"손홍훈");
        son.addSubject("국어",100);
        son.addSubject("수학",100);
        son.showStudentInfo();
    }


}
