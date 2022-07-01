package example;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {

        int[] arr = new int[] {83,90,87};

        System.out.println(addArr(arr));
    }

    public static int addArr(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
