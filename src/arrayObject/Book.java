package arrayObject;

public class Book {
      String bookName;
      String author;

    Book(){};

     public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }



    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void showInfo(){
    System.out.println(bookName+", "+author);
    }
}
