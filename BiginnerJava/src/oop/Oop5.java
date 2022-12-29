
package oop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Oop5 {
    public static void main(String[] args) {
        // Date/Month/Year................
        
        
        Date date = new Date();
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println(currentDate);
        
        
        // Hour :: Minute :: Second................
        
        
        LocalTime time = LocalTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh : mm : ss");
        String formatTime = time.format(formatter);
        System.out.println(formatTime);
    }

}
