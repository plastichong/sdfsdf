package string;

public class StringCharAt {
    public static void main(String[] args) {

//        String subject = "자바 프로그래밍";

        //charAt 매개값으로 주어진 인덱스의 문자를 리턴
//        System.out.println(subject.charAt(3));

        //주민등록번호에서 남자와 여자 구분하기


        String ssn = "950407-1177411";
        char gender = ssn.charAt(7);

        switch (gender) {

            case '1':
            case '3':
                System.out.println("male");
                break;
            case '2':
            case '4':
                System.out.println("female");
                break;

            default:
                System.out.println("유효하지않은 입력");
                break;
        }

        //indexOf()  매개값으로 주어진 문자열이 시작되는 인덱스를 반환함
        //중복값은 확인 할 수 없음
        //맨 처음 만난 곳에서 반환
        System.out.println(ssn.indexOf("1"));


    }
}
