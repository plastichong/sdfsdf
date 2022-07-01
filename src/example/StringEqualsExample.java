package example;

public class StringEqualsExample {
    public static void main(String[] args) {
        String str1 = "위수영";
        String str2 = "위수영";
//        System.out.println(str5.toString());
        if(str1==str2){
            System.out.println("같은 주소를 참조 중 ");
        }else {
            System.out.println("다른 주소를 참조 중");
        }
        if(str1.equals(str2)){
            System.out.println("같은 문자열");
        }

        String str3 = new String("위수영");
        String str4 = new String("위수영");
        if(str3==str4){
            System.out.println("같은 주소를 참조 중 ");
        }else {
            System.out.println("다른 주소를 참조 중");
        }
        if(str3.equals(str4)){
            System.out.println("같은 문자열");
        }

    }
}
