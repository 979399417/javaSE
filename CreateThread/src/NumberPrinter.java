public class NumberPrinter extends Thread {
    private Printer p;
    public NumberPrinter(){

    }

    public NumberPrinter(Printer p) {
        this.p = p;
    }
    @Override
    public void run() {
        for(int i = 1;i<=52;i++){
            p.print(i);
        }

    }
}
