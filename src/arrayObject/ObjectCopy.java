package arrayObject;

public class ObjectCopy {

    public static void main(String[] args) {

        Book[] arr1= new Book[3];
        Book[] arr2= new Book[3];

        arr1[0] = new Book("혼자공부하는 자바","신용권");
        arr1[1] = new Book("반응형 웹","나잘난");
        arr1[2] = new Book("스트링부트","이강산");

        System.arraycopy(arr1,0,arr2,0,3);


        }
    }

