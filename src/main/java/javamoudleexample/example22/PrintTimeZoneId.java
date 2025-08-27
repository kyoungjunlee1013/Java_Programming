package javamoudleexample.example22;

import java.util.TimeZone;

public class PrintTimeZoneId {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for(String id : availableIDs){
            System.out.println(id);
        }
    }
}
