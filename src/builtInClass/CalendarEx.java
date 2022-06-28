package builtInClass;

import constant.UsingDefine;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //년 월 일
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        //시 분 초
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year+" 년 "+month+" 월 "+date+" 일");
        System.out.println("=================================");
        System.out.println(hour+" 시 "+minute+" 분 "+second+" 초");

        int day = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);//1==일 2==월 3==화

        UsingDefine my = new UsingDefine();
        int age = my.GIRL_FRIEND_AGE;
//        System.out.println(UsingDefine.GIRL_FREIND_AGE);
        System.out.println(age);
    }
}
