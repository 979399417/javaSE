public class Demo03Deadlock {
   public static Object lock1=new Object();
   public static Object lock2=new Object();

    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }

    }

class Thread1 implements Runnable{
    @Override
    public void run() {
        synchronized (Demo03Deadlock.lock1){
            System.out.println("取得1要做的事情");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Demo03Deadlock.lock2){
                System.out.println("取得一和二要做的事情");
            }

        }
    }
}
class Thread2 implements Runnable {
    @Override
    public void run() {
        synchronized (Demo03Deadlock.lock1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Demo03Deadlock.lock2) {
                System.out.println("取得2要做的事情");
                System.out.println("取得一和二要做的事情");
            }

        }

    }
}