public class Demo04ThreadGroup {
    public static void main(String[] args) {
        myrunnable r=new myrunnable();
        ThreadGroup tg=new ThreadGroup("我们的线程组");
        Thread t1=new Thread(tg,r);
        Thread t2=new Thread(tg,r);
        System.out.println(t1.getThreadGroup().getName());
//        t1.start();
//        t2.start();
//         ThreadGroup tg=  t1.getThreadGroup();
//         System.out.println(tg.getName());
//         System.out.println(t2.getThreadGroup().getName());
    }
}
