package builtInClass;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int i,j;

        for ( i = 0; i < lotto.length; i++) {
            lotto[i] = (int)(Math.random()*45)+1;
            for (j = 0; j < i; j++) { // 안쪽 for문의 첫 번째는 j < i 가 false이므로 돌지않음
            if(lotto[i]==lotto[j]){
                System.out.println("중복 발생! i : "+lotto[i]+", j : "+lotto[j] );
                i--;
            }

            }

        }
        for (i = 0; i < lotto.length ;i ++) {
            System.out.print(lotto[i]+", ");
        }


    }
}
