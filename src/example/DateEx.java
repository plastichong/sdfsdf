package example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();

        String now1 = now.toString();

        System.out.println(now1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일");

        String strnow2 = sdf.format(now);
        System.out.println(strnow2);
    }
}
