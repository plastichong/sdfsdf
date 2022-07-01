package arrayObject;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[3];

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        library[0].setBookName("노인과 바다");
        library[0].setAuthor("어니스트 헤밍웨이");
//        library[0].showInfo();
//        library[1].showInfo();
//        library[2].showInfo();

        for (Book book : library) {
            book.showInfo();
        }

    }

}
