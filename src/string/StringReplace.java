package string;

public class StringReplace {
    public static void main(String[] args) {
        String str1 = "    자바 프로그래밍";
        String str2 = str1.replace("자바","JAVA");
        String str3 = str1.trim();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);



    }
}
