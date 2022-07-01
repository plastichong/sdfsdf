package scorearray;

public class sortEx2 {
    public static void main(String[] args) {
        // 문자 오름차순 정렬

        char[] arr = {'S', 'B', 'M', 'K', 'C', 'Z', 'A'};
        int i, j;
        char temp;
        for (i = 0; i < arr.length; i++) {
            for (j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + ", ");
        }
        System.out.println();
        for (int k = 0; k < arr.length; k++) {
            int s = (int) (arr[k]);
            System.out.print(s + ", ");

        }
    }
}
