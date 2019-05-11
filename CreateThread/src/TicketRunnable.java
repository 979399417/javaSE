import java.util.concurrent.locks.ReentrantLock;

public  class TicketRunnable implements Runnable {
    private static int count = 100;
    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
            while (count>0) {
                lock.lock();
                try {
                    if (count > 0) {
                        System.out.println(Thread.currentThread().getName() + "：卖出第" + count + "张票");
                        count--;
                    }
                }
                finally {
                    lock.unlock();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
//    public synchronized void sellTicket() {
//            if (count > 0) {
//                System.out.println(Thread.currentThread().getName() + "：卖出第" + count + "张票");
//                count--;
//            }
//        }
}