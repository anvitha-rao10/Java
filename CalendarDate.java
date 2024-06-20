// The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
// You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
import java.io.*;
import java.util.*;
class Result {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        return days[dayOfWeek - 1];
    }
}
public class CalendarDate {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        
        String res = Result.findDay(month, day, year);
        
        System.out.println(res);
        
        sc.close();
    }
}
