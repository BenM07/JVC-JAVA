package jvc.time;

import java.time.ZoneId;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    
    private String timeNow;
    private int hrs, min, sec;
    private String mid;
    
    public Time(String timeZone) {
        
        String[] timeArray = null;
        ZoneId id = ZoneId.of(timeZone);
        LocalTime time = LocalTime.now(id);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.timeNow = time.format(dTF);
        
        timeArray = this.timeNow.split(":");
        this.hrs = Integer.parseInt(timeArray[0]);
        this.min = Integer.parseInt(timeArray[1]);
        this.sec = Integer.parseInt(timeArray[2]);
        
        this.mid = (this.hrs > 11) ? "PM" : "AM";
        
    } // close constructor
    
    public String getTimeNow() {
        return this.timeNow;
    } // close getTimeNow method
    
    public int getHour() {
        return this.hrs;
    } // close geHour method
    
    public int getMinute() {
        return this.min;
    } // close getMinute method
    
    public int getSecond() {
        return this.sec;
    } // close getSecond method
    
    public String getMidday() {
        return this.mid;
    }
    
} // close class
