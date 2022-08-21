package time;

import sharedmodels.department.Course;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

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

    public static ArrayList<Course> getSortedCourses(ArrayList<Course> courses) {
        ArrayList<LocalDateTime> examTimes = new ArrayList<>();
        for (int i = 0; i < courses.size(); i++) {
            String timeString = courses.get(i).getExamTime();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'At' HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(timeString, formatter);
            examTimes.add(localDateTime);
        }
        for (int i = 0; i < examTimes.size() - 1; i++) {
            for (int j = 0; j < examTimes.size() - i - 1; j++) {
                if (examTimes.get(j).isAfter(examTimes.get(j + 1))) {
                    Collections.swap(courses, j, j + 1);
                    Collections.swap(examTimes, j, j+1);
                }
            }
        }

        return courses;
    }

    public static boolean isSelectionUnitTime(String startTime, String endTime){
        if (startTime == null || endTime == null || startTime.equals(" ") || endTime.equals(" "))return false;
        String timeNow = DateAndTime.getDateAndTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'At' HH:mm:ss");
        LocalDateTime localDateTimeNow = LocalDateTime.parse(timeNow, formatter);
        LocalDateTime localDateTimeStart = LocalDateTime.parse(timeNow, formatter);
        LocalDateTime localDateTimeEnd = LocalDateTime.parse(timeNow, formatter);
        if (localDateTimeNow.isAfter(localDateTimeEnd))return false;
        else if (localDateTimeNow.isBefore(localDateTimeStart)) return false;
        else return true;
    }
}
