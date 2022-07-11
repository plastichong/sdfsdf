package example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx2 {
    public static void main(String[] args) {
        Date now = new Date();

        Calendar c = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 ");

        String str = sdf.format(now);

        String[] weeks = new String[]{"일","월","화","수","목","금","토"};
        String strWeek = weeks[ c.get(Calendar.DAY_OF_WEEK)-1];

        str += strWeek;


        System.out.println(str);
    }
}
