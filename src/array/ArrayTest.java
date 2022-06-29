package array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numArr = new int[5];

        String[] strArr = new String[3];

        Product[] pArr = new Product[3];

        pArr[0] = new Product("car",12300000);
        pArr[1] = new Product("smartPhone",500000);
        pArr[2] = new Product("AIspeaker",33000);


        for (Product product : pArr) {
            System.out.println(product.showInfo());

        }
    }







}
