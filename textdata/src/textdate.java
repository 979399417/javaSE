import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class textdate {
    public static void main(String[] args) {
        Date d=new Date(1000);
        System.out.println(d);
      //  d.setTime(51515151);
        System.out.println(d.getTime());
        SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
        String str=df.format(d);
        System.out.println(str);
        String str2="1999-7-7";
        DateFormat df2=new SimpleDateFormat("yyyy-MM-dd");
        Date d2=df2.parse(str2);


    }
}
