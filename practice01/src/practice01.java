import sun.java2d.pipe.SpanShapeRenderer;

import java.text.*;
import java.util.Date;
import java.util.LinkedList;

public class practice01 {
    public void delect(String s){

        for (int i=0;i<s.length();i++){

        }
    }
    public static void main(String[] args) {
        Date d=new Date();
       SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");

        String str=f.format(d);
        System.out.println(str);
        String ss="2019-3-3";

        DateFormat ff=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date df2=ff.parse(ss);
            System.out.println(df2);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        StringBuilder Str=new StringBuilder("asdasda");//字符串

        int k=Str.length();
        for (int i=1;i<=10;i++){
            Str.insert(k,i);
            k++;
        }
        System.out.println(Str);
        LinkedList a=new LinkedList();
        a.add("sss");
        a.add("as");
        a.add("sss");
        a.add("sgs");



    }
}
