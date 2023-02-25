package Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarJava {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2019, 1, 4);
        System.out.println(calendar.getTime());
        Calendar current = Calendar.getInstance();
        System.out.println(current.getTime());
    }
}
