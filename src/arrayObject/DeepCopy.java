package arrayObject;

public class DeepCopy {
    public static void main(String[] args) {
        Book[] arr1 = new Book[3];
        Book[] arr2 = new Book[3];

        arr1[0] = new Book("혼자공부하는 자바", "신용권");
        arr1[1] = new Book("반응형 웹", "나잘난");
        arr1[2] = new Book("스트링부트", "이강산");

        //arr2 기본생성자로 생성

        arr2[0] = new Book();
        arr2[1] = new Book();
        arr2[2] = new Book();



//        System.arraycopy(arr1, 0, arr2, 0, 3);
        for (int i = 0; i < arr1.length ; i++) {
            arr2[i].setBookName(arr1[i].getBookName());
            arr2[i].setAuthor(arr1[i].getAuthor());
        }

        arr1[0].setBookName("멋진 신세계");
        arr1[0].setAuthor("올더스 헉슬리");

        System.out.println("arr1====================");
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i].showInfo();
        }

        System.out.println("arr2====================");
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i].showInfo();
        }
    }
}
