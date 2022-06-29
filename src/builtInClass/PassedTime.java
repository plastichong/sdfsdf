package builtInClass;

import java.util.Calendar;

public class PassedTime {
    public static void main(String[] args) {
        Calendar starDay = Calendar.getInstance();

        Calendar toDay = Calendar.getInstance();

        toDay.set(2022,6,29);
        //toDay
        System.out.println(toDay.get(Calendar.YEAR));
        System.out.println(toDay.get(Calendar.MONTH));
        System.out.println(toDay.get(Calendar.DATE));


        starDay.set(2022,5,9);
        //startDay
        System.out.println(starDay.get(Calendar.YEAR));
        System.out.println(starDay.get(Calendar.MONTH));
        System.out.println(starDay.get(Calendar.DATE));


        //passedDay calc
        double passedDay = toDay.getTimeInMillis()-starDay.getTimeInMillis();
        passedDay = (double)(passedDay/(1000*60*60*24));
        System.out.println("개강 이후 "+passedDay+"일 ");
//        System.out.println(1000*60*60*24);
//        System.out.println(pass);
    }
}
