package nastedclass;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    class Score{
        int eng;
        int math;

        void showInfo(){
            System.out.println("이름 : "+name);
            System.out.println("영어 점수 : "+eng);
            System.out.println("수학 점수 : "+math);
        }
    }


}
