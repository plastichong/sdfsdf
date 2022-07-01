package reference;

public class Student {
    int studentId;
    String studentName;
    Subject korean;
    Subject math;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
         korean = new Subject();
         math = new Subject();
    }

    public void koreanSubject(String name,int score){
        korean.setSubjectName(name);
        korean.setScorePoint(score);
    }
    public void mathSubject(String name,int score){
        math.setSubjectName(name);
        math.setScorePoint(score);
    }

    public void showInfo(){
        System.out.println("studentName : "+studentName);
        System.out.println("studentId : "+studentId);
        System.out.println("SubjectKorean : "+korean.getScorePoint());
        System.out.println("SubjectMath : "+math.getScorePoint());
    }
}
