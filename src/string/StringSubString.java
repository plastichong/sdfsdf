package string;

public class StringSubString {
    public static void main(String[] args) {

        String ssn = "950407-1177411";

        String firstNum = ssn.substring(0,6);
        //매개값을 인덱스로 해당 "구간"의 문자열을 반환

        String secondNum = ssn.substring(7);
        //매개값이 하나일 경우 해당 매개값을 시작 인덱스로 하여 문자열의 끝까지

        System.out.println(firstNum);
        System.out.println(secondNum);

    }
}
