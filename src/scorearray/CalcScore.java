package scorearray;

import java.util.Scanner;

public class CalcScore {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner sc = new Scanner(System.in);
        while (run) {
            try {
                System.out.println("=======================");
                System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
                System.out.println("=======================");
                System.out.print("선택 > ");
                int selectNum = Integer.parseInt(sc.nextLine());
                if (selectNum == 1) {
                    System.out.print("학생수 > ");
                    studentNum = Integer.parseInt(sc.nextLine());
                    scores = new int[studentNum];
                } else if (selectNum == 2) {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "] > ");
                        scores[i] = Integer.parseInt(sc.nextLine());
                    }

                } else if (selectNum == 3) {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "] : " + scores[i]);
                    }
                } else if (selectNum == 4) {
                    int max = scores[0];
                    int sumV = 0;
                    double avgV = 0.0;
                    for (int i = 0; i < scores.length; i++) {
                        sumV += scores[i];
                        for (int j = 0; j < scores.length; j++) {
                            if (scores[i] > scores[j]) {
                                max = scores[i];
                            }
                        }
                    }
                    avgV = (double) sumV / scores.length;
                    System.out.println("총점 : " + sumV);
                    System.out.println("평균 : " + avgV);
                    System.out.println("최고점수 : " + max);
                } else if (selectNum == 5) {
                    System.out.println("프로그램 종료.");
                    run = false;
                } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }

        }


    }
}
