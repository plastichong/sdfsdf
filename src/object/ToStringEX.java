package object;

public class ToStringEX {
    public static void main(String[] args) {

        String name = new String("Hello World!");
        System.out.println(name);

        System.out.println(name.toString());

        Object obj = new String("hi");

        System.out.println(obj.toString());

        Book book = new Book(12,"개미");

        System.out.println(book.bookTitle.toString());


    }
}
