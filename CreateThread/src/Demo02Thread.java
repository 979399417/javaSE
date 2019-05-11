public class Demo02Thread {
    public static void main(String[] args) {
        myrunnable t=new myrunnable();
        Thread T1=new Thread(t,"线程T1");
        Thread T2=new Thread(t,"匿名线程T2"){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName() +":"+i);
                }
            }
        };
      //  T2.start();
        Mythread t2 = new Mythread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        };
        T2.start();
      //  t2.start();
    }
}
