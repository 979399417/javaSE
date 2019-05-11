public class myrunnable implements Runnable {
    String data="";
    @Override
    public void run() {
        Thread t=new Thread();

        for (int i = 0; i < 1000; i++) {
            System.out.println(t.currentThread().getName()+":"+i);
        }
    }

}
