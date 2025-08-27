package javamoudleexample.example21;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
    public static void main(String[] args) {
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timezone);
        
        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if(amPm == Calendar.AM){
            strAmPm = "AM";
        } else {
            strAmPm = "PM";
        }
        
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(strAmPm + " ");
        System.out.println(hour + "시 ");
        System.out.println(minute + "분 ");
        System.out.println(second + "초 ");
    }
}
