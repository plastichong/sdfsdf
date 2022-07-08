package string;

public class StringIndexOf {
    public static void main(String[] args) {

        String str = "자바 프로그래밍";

//        int location = str.indexOf("프로그래밍");
//        System.out.println(location);

        if (str.indexOf("자바") != -1){
            System.out.println("자바와 관련된 책이네요");
        }else {
            System.out.println("자바와 관련이 없네요");
        }



    }
}
