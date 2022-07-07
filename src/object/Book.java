package object;

public class Book {
    int bookNum;
    String bookTitle;

    Book(int bookNum, String bookTitle) {
        this.bookNum = bookNum;
        this.bookTitle = bookTitle;
    }


    @Override
    public int hashCode() {
        return bookNum;
    }



    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            if (this.bookNum == book.bookNum) {
                return true;
            }
        }
        return false;
    }


}
