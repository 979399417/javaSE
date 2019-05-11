import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df= new SimpleDateFormat("yyyy MM dd hh;mm;ss属于本年第w周");
        Date d=new Date(122515151515L);
        String str=df.format(d);
        System.out.println(str);
        String str2;
        str2="1999,9,9";
       SimpleDateFormat df2=new SimpleDateFormat("yyyy,MM,dd");
        //df2.format(str2);
       Date d2=df2.parse(str2);

    }
    
}
