package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static String getDateAndTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'At' HH:mm:ss");
        return localDateTime.format(formatter);
    }
    public static String getFormatTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'At' HH:mm:ss");
        return localDateTime.format(formatter);
    }
    public static boolean isOverTime(String lastTime, String newTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'At' HH:mm:ss");
        LocalDateTime last = LocalDateTime.parse(lastTime, formatter);
        LocalDateTime now = LocalDateTime.parse(newTime, formatter);
        last = last.plusHours(3);
        if (now.isAfter(last)) {
            return true;
        } else {
            return false;
        }
    }
}
