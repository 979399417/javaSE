public class LetterPrinter extends Thread {
    private Printer p;
    public LetterPrinter() {
    }

    public LetterPrinter(Printer p) {
        this.p = p;
    }
    @Override
    public void run() {
        for(char c ='A';c<='Z';c++){
            p.print(c);
        }
    }
}
