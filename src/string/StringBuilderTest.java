package string;

public class StringBuilderTest {
    public static void main(String[] args) {

        //StringBuilder 내부의 변경가능한 char[] 변수를 가지고 있음

        String javaStr = new String("java");
        System.out.println("처음 문자열 주소 값 : "+System.identityHashCode(javaStr));
        String androidStr = new String("android");
        javaStr = javaStr.concat(androidStr);
        System.out.println("concat 연산 후 String 주소 값 : "+System.identityHashCode(javaStr));

        //내부 문자열 변경시 새로운 String 객체가 생성됨
        //기존 String 객체는 GC가 수거

        StringBuilder builder = new StringBuilder(javaStr);
        System.out.println("연산 전 builder 메모리 주소 : "+System.identityHashCode(builder) );

        builder.append(" and");
        builder.append(" android");
        builder.append(" programming is fun!!");

        System.out.println("연산 후 builder 메모리 주소 : "+System.identityHashCode(builder) );
        //내부 문자열이 변경되어도 같은 객체임을 확인


    }
}
