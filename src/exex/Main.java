package exex;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int hour;
        int minute;
        int TurkeyTime;

        Scanner sc = new Scanner(System.in);

        hour = sc.nextInt();
        minute = sc.nextInt();
        TurkeyTime = sc.nextInt();

        Timer timer = new Timer();
        timer.setCurrentTime(hour, minute);
        TurkeyKiller tk = new TurkeyKiller(timer);
        tk.killTurkey(TurkeyTime);
    }
}

class TurkeyKiller{
    private Timer timer;

    TurkeyKiller(Timer timer){
        this.timer = timer;
    }

    public void killTurkey(int minute){
        timer.startTimer(minute);
        timer.printCurrentTime();
    }
}

class Timer{
    private int hour;
    private int minute;

    public void setCurrentTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public void startTimer(int minute){
        this.minute += minute;

        if(this.minute >= 60){
            hour += this.minute / 60;
            this.minute = this.minute % 60;
        }

        if(hour >= 24){
            hour -= 24;
        }
    }

    public void printCurrentTime(){
        System.out.print(this.hour);
        System.out.print(" "+this.minute);
    }
}