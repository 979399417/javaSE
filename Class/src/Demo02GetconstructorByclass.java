import java.lang.reflect.Constructor;

public class Demo02GetconstructorByclass {
    public static void main(String[] args) throws Exception {
        Class c=Class.forName("User");
        //1 得到所有的publicg构造方法
//        Constructor[]cs=c.getConstructors();//得到所有的publicg构造方法
//        for (Constructor con:cs
//             ) {
//            System.out.println(con);
//        }
        //2 得到指定的构造方法
//        Constructor con=c.getConstructor();
     //  Constructor com= c.getConstructor(int.class,String.class,String.class);

//        Constructor[]cs=c.getDeclaredConstructors();//得到所有的publicg构造方法//忽略访问权限得到所有访问权限
//        for (Constructor con:cs
//             ) {
//            System.out.println(con);

        Constructor con=c.getDeclaredConstructor(int.class);
        con.setAccessible(true);
        Object o1=con.newInstance(100);
        User user=(User)o1;
        user.show();


        //3 调用构造方法
//         Object o1= c.newInstance();
//         User user=(User)o1;
//         user.show();
//        Object o1=com.newInstance(100,"yv","123");
//        User user=(User)o1;
//        user.show();
    }
}
