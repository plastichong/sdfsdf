package scorearray;

public class SortEx {
    public static void main(String[] args) {
        //1,2,3,4, bubble bubble
        //bubble sort

        int[] arr = {7, 3, 6, 9, 2, 8


                , 5, 4, 1};
        int i;
        int j;
        int temp;

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

//        for (i = 0; i < arr.length ; i++) {
//            for (j = 1; j <arr.length-i ; j++) {
//                if(arr[j-1] > arr[j]){
//                    temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }


        for (int a : arr) {
            System.out.print(a + ",");
        }

    }
}
