public class TicketThread extends Thread {
    private static int count=100;
    private static Object lock=new Object();

    public TicketThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        while (count>0) {
            sellTicket();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public void sellTicket() {
        synchronized (this) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() + "：卖出第" + count + "张票");
                count--;
            }
        }
    }

}
