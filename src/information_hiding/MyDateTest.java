package information_hiding;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.setMonth(2);
        date.setYear(2022);
        date.setDay(29);
        System.out.println("나의 생일은 " + date.getYear() + "년 " + date.getMonth() + "월 " + date.getDay() + "일 입니다");

        short s =0;
        byte b =0;
        int i =10000000;
        long l =0l;
        float f =0.0f;
        double d =0.0;
        char c = 'c';
        d = (double)c;
        b = (byte)i;

        System.out.println(b);

    }
}
