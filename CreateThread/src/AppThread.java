public class AppThread implements Runnable {
    public AppThread(Object lock) {
        this.lock=lock;
    }
    private Object lock;
    @Override
    public void run() {
        while (TicketMng.count > 0) {
            if (TicketMng.count  > 0) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + "卖出第" + TicketMng.count + "张票");
                    TicketMng.count --;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
