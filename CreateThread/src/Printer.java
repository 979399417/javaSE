public class Printer {
    public Printer(int index) {
        super();
        this.index = index;
    }
    public static int index = 1;
    public Printer(){}

    public synchronized void print(int i) {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            while (index % 3 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.print(i);
                index++;
               this.notifyAll();




    }

    public synchronized void print(char c) {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            while (index % 3 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.print(c);
                index++;
               this.notifyAll();


    }
}