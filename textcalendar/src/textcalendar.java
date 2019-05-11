import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

public class textcalendar {
    public static void main(String[] args) {
        Calendar c;
        c = new GregorianCalendar();
        c.set(2019,Calendar.JANUARY
                ,30);
        c.add(MONTH,-15);
        System.out.println(c.getTime());
    }
}
