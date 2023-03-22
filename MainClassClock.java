package com.mycompany.mainclassclock;
import java.util.*;

public class MainClassClock {
   
    public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);

        // instantiate firstClock using seconds since midnight from keyboard
        System.out.print("Enter seconds since midnight for first clock: ");
        int seconds = scanner.nextInt();
        Clock firstClock = new Clock(seconds);

        // tick the clock ten times and print out the time after each tick
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println("First Clock Time: " + firstClock.toString());
        }

        // instantiate secondClock using hours, minutes, seconds from keyboard
        System.out.print("Enter hours for second clock: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes for second clock: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds for second clock: ");
        int seconds2 = scanner.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds2);

        // tick the second clock ten times and print out the time after each tick
        for (int i = 0; i < 10; i++) {
  secondClock.tick();
            System.out.println("Second Clock Time: " + secondClock.toString());
        }

        // add secondClock time in firstClock
        firstClock.addClock(secondClock);

        // print both clock objects calling toString method
        System.out.println("First Clock Time after adding Second Clock Time: " + firstClock.toString());
        System.out.println("Second Clock Time: " + secondClock.toString());
}

}
