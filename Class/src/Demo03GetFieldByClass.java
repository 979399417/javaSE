import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Demo03GetFieldByClass {
    public static void main(String[] args) throws Exception{
        User u=new User(100,"yj","123");
        Class c1=Class.forName("User");
        //获得成员变量的方法
//        Field[] files= c1.getFields();
//        for (Field f:files
//             ) {
//            System.out.println(f);
//        }
//        Field f=c1.getField("age");
//        System.out.println(f);
        
//        Field username= c1.getDeclaredField("usermame");
//        username.setAccessible(true);
//        System.out.println(username.get(u));

//        Field fields[]=c1.getDeclaredFields();
//        for (Field f:fields
//             ) {
//            System.out.println(f);
//        }

    }
}
