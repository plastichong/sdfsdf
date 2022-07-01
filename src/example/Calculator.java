package example;

public class Calculator {
    int plus(int... arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }



    double avg(int... arr) {

        double sum = plus(arr);
        double result = sum / arr.length;
        return result;
    }



    void execute(int... arr) {
        double result = avg(arr);
        println("실행결과: " + result);
    }

    void println(String message) {
        System.out.println(message);
    }


}
