package builtInClass;

import java.util.Calendar;

public class PassedTime2 {
    public static void main(String[] args) {
        Calendar startDay = Calendar.getInstance();
        Calendar toDay = Calendar.getInstance();


        startDay.set(2022,5,9);
        //startDay
        System.out.print("개강일 : ");
        printDate(startDay);


        toDay.set(2022,6,29);
        //toDay
        System.out.print("오늘날자 : ");
        printDate(toDay);




        //passedDay calc
        long passedDay = toDay.getTimeInMillis()-startDay.getTimeInMillis();
        passedDay = (passedDay/(1000*60*60*24));
        System.out.println("개강 이후 "+passedDay+"일 ");
    }

    private static void printDate(Calendar date) {
        System.out.println(date.get(Calendar.YEAR)+"년 "+date.get(Calendar.MONTH)+"월 "+date.get(Calendar.DATE)+"일");
    }
}
