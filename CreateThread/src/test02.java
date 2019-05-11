public class test02 {
    public static void main(String[] args) {
//        WindowsThread t=new WindowsThread();
//        Thread t1=new Thread(t,"Windows窗口");
//        AppThread g=new AppThread();
//        Thread t2=new Thread(new AppThread(),"App窗口");
//        t1.start();
//        t2.start();
//        Object lock=new Object();
//        new Thread(new AppThread(lock),"App窗口").start();
//        new Thread(new WindowsThread(lock),"Windows窗口").start();
        Printer p=new Printer();
        NumberPrinter m=new NumberPrinter(p);
        LetterPrinter l=new LetterPrinter(p);
        m.start();
        l.start();
    }
}
