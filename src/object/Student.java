package object;

public class Student {

    private String studentNum;


    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    @Override   //equals 재정의 why?
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (studentNum.equals(student.studentNum)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }
}
