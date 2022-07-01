package example;

public class ArrayInArray {
    public static void main(String[] args) {
        int[][] socres = new int[2][3];
        //  0 0
        //  0 0
        //  0 0
        System.out.println(socres.length);
        System.out.println(socres[0].length);

        for (int i = 0; i < socres.length ; i++) {
            for (int j = 0; j <socres[i].length ; j++) {
                System.out.println("scores["+i+"]["+j+"] = "+socres[i][j]);
            }
        }
        System.out.println();

        int[][] arr = new int[2][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
            }
        }
        System.out.println();

        int[][] arr2 = {{95,90},{92,96,80}};
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {
                System.out.println("arr2["+i+"]["+j+"] = "+arr2[i][j]);
            }
        }


    }
}
