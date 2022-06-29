package com.company;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static Timer timer;
    static int x;
    static int interval;

    public static void main(String[] args) {
        int Start;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer votre pin");
        Start = lectureClavier.nextInt();
        if (Start <= 32) {
            System.out.print("How much money do you have at the moment?");
                x = lectureClavier.nextInt();
            System.out.println("How much time do you want it to be active? ");
                String secs = lectureClavier.next();
            interval = Integer.parseInt(secs);
            timer = new Timer();
            int delay = 1000;
            int period = 1000;
            System.out.println(secs);
            timer.scheduleAtFixedRate( new TimerTask() {
                public void run() {
                    System.out.println(setInterval());
                }
            }, delay, period);
        }
    }
    public static int setInterval(){
        if(interval==1){
            timer.cancel();
            System.out.println("Time is up! You gained " + x + " dollars. Rest well my friend!");
        }
        return interval--;
    }
}