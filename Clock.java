package com.mycompany.mainclassclock;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    
    // default constructor
    public Clock() {
        this(12, 0, 0);
    }
    
    // constructor with three parameters
    public Clock(int hours, int minutes, int seconds) {
        setClock(hours * 3600 + minutes * 60 + seconds);
    }
    
    // constructor with one parameter
    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }
            
    // set-method method to set clock time based on seconds since midnight
    public void setClock(int secondsSinceMidnight) {
        this.hours = secondsSinceMidnight / 3600 % 24;
        this.minutes = secondsSinceMidnight % 3600 / 60;
        this.seconds = secondsSinceMidnight % 60;
    }
    
    // get-methods to get the clock time
    public int getHours() {
        return hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    // set-methods to set the clock time
    public void setHours(int hours) {
        this.hours = hours % 24;
    }
    
    public void setMinutes(int minutes) {
        this.minutes = minutes % 60;
    }
    
    public void setSeconds(int seconds) {
        this.seconds = seconds % 60;
    }
    
    // increment time by one second
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
    }
    
    // decrement time by one second
    public void tickDown() {
        seconds--;
        if (seconds == -1) {
            seconds = 59;
            minutes--;
        }
           if (minutes == -1) {
            minutes = 59;
            hours--;
        }
        if (hours == -1) {
            hours = 23;
        }
    }
    
    // add time represented by another clock object
    public void addClock(Clock clock) {
        int totalSeconds = (hours + clock.getHours()) * 3600 +(minutes + clock.getMinutes()) * 60 +(seconds + clock.getSeconds());
        setClock(totalSeconds);
    }
    
    // subtract time represented by another clock object
    public Clock subtractClock(Clock clock) {
        int totalSeconds = (hours - clock.getHours()) * 3600 +(minutes - clock.getMinutes()) * 60 +(seconds - clock.getSeconds());
        return new Clock(totalSeconds);
    }
    
    // return string representation of clock object
    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
}
}
