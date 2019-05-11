import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class visualcalendar {
    public static void main(String[] args) {
        String temp="2019-2-2";
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar=new GregorianCalendar();
     //   calendar.set();
       // System.out.println("日\t一\t二\t三\t四\t五\t六");
    //    Date d=format.parse(temp);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.getActualMaximum(Calendar.DATE));

        int a=Calendar.SATURDAY;
        calendar.add(Calendar.DATE,1);
    }
}
