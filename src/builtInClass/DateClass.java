package builtInClass;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        //Data class

        Date today = new Date();
        System.out.println(today);

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(date.format(today));
        SimpleDateFormat time = new SimpleDateFormat("hh-mm-ss");
        System.out.println(time.format(today));

        //Local Date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        System.out.println("==================");

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter mydt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");

        System.out.println("LocalDateTime : "+now);

        System.out.println("=====================");
        String formattedDate = now.format(mydt);
        System.out.println(formattedDate);



    }
}
