package builtInClass;

import java.util.Calendar;

public class CalenderEc {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);

        System.out.println(year+"년");
        System.out.println(month+"월");
        System.out.println(day+"일");
        System.out.println(week+"요일");

    }
}
