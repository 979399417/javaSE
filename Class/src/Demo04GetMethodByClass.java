import java.lang.reflect.Method;

public class Demo04GetMethodByClass {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("User");
        User u=new User(100,"yj","123");
//        Method method=c.getMethod("show");
//        Object o=method.invoke(u);
//        System.out.println(o);


//        Method []methods=c.getMethods();
//        for (Method m:methods
//             ) {
//            System.out.println(m);
//        }
        Method method=c.getDeclaredMethod("study",String.class);
        Object o=method.invoke(u,"java");
        System.out.println(o);

    }
}