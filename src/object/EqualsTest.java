package object;

public class EqualsTest {
    public static void main(String[] args) {
        String color1 = new String("빨강");
        String color2 = new String("빨강");

        System.out.println("객체 주소값 비교 : "+(color1 == color2));
        System.out.println("문자열 비교 : "+color1.equals(color2));

        Book book1 = new Book(12,"개미");
        Book book2 = new Book(12,"개미");

        System.out.println("객체 주소값 비교 : "+(book1 == book2));
        System.out.println("문자열 비교 : "+book1.equals(book2));

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        System.out.println(color1.hashCode());
        System.out.println(color2.hashCode());

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
