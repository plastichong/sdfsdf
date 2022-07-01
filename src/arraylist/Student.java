package arraylist;

import reference.Subject;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        double avg = 0.0;

        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);

            total += subject.getScorePoint();
            avg = (int) (total / subjectList.size());
            System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() + " 과목 성적은 " + subject.getScorePoint() + " 점 입니다.");
        }
        System.out.printf("학생 %s의 총점은 %d점이고, 평균은 %.2f점 입니다.\n",studentName,total,avg);
//        System.out.println("총점 : "+total);
//        System.out.println("평균 : "+avg);

    }


}
