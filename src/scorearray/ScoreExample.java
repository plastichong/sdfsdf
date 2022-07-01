package scorearray;

public class ScoreExample {
    public static void main(String[] args) {
        //명의 자바 과목 점수
        int[] score = {80,90,74,100,50};

        int totalScroe = 0;
        double avgScore = 0.0;
        int maxV = 0;
        int minV;
        //총점
        for (int i = 0; i <score.length ; i++) {
            totalScroe += score[i];
        }

        //평균
        avgScore = (double)(totalScroe)/score.length;

        System.out.println(totalScroe);
        System.out.println(avgScore);

        maxV = score[0];
        for (int i = 1; i < score.length; i++) {
            if (maxV < score[i]){
                maxV = score[i];
            }
        }
        minV = score[0];
        for (int i = 1; i < score.length; i++) {
            if (minV > score[i]){
                minV = score[i];
            }
        }


        System.out.println("최고점수 : "+maxV);
        System.out.println("최저점수 : "+minV);
    }
}
