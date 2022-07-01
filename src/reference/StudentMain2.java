package reference;

public class StudentMain2 {

    public static void main(String[] args) {
        //사람 객체 생성
        Student2 lee = new Student2(1001, "이양파");
        Student2 park = new Student2(1002, "박마늘");

        //과목 입력
        lee.koreanSubject("국어", 90);
        lee.mathSubject("수학", 80);
        park.koreanSubject("국어", 80);
        park.mathSubject("수학", 75);

        //출력
        lee.showInfo();
        park.showInfo();
    }

}