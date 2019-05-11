public class Demo01CreaThread {

    public static void main(String[] args) {
        Mythread thread = new Mythread();
        System.out.println( thread.getPriority());
        thread.setPriority(10);
        System.out.println( thread.getPriority());
        thread.start();
        thread.setName("线程1");
        Mythread t1 = new Mythread("线程2");
        thread.start();
        try {
            Thread.sleep(20);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setDaemon(true);
        t1.start();
    }
}
