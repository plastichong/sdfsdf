package information_hiding;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            if (month == 2 && (day < 1 || 28 < day)) {
                System.out.println("윤년입니다");
                this.day = day;
            }
        } else if (month == 2 && (day < 1 || 28 < day)) {
            System.out.println("날짜 오류 : " + year + "년은 윤년이 아닙니다");
        } else if (month != 2) {
            this.day = day;
        }


    }

    public int getDay() {
        return this.day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
