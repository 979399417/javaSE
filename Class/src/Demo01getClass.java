public class Demo01getClass {
    public static void main(String[] args) {
        User user1=new User(100,"james","123456");
        User user2=new User(101,"yj","994");
        Class c1=user1.getClass();
        System.out.println(c1);
        Class c2=user2.getClass();
        System.out.println(c2);
        System.out.println(c1==c2);
        Class c4=User.class;
        System.out.println(c1==c4);
        try {
            Class c5=Class.forName("java.lang.Math");
            System.out.println(c1==c5);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
