package booklist;

import arrayObject.Book;

import java.util.ArrayList;

public class BookListTest {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book("만들어진 신","리차드 도킨스");
        Book book2 = new Book("눈먼 시계공","리차드 도킨스");
        Book book3 = new Book("자유의지는 없다","샘 해리스");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);



        for (int i = 0; i < bookList.size() ; i++) {
            Book book = bookList.get(i);
            book.showInfo();
        }

    }
}
