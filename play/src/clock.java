import java.io.PrintStream;

public class clock {
    private play hour=new play(24);
    private play minutes=new play(60);

    public void star() {
        while (true) {
            minutes.increase();
            if (minutes.getValue() == 0) {
            hour.increase();
            }
          System.out.printf("%02d;%02d\n", hour.getValue(), minutes.getValue());
        }
    }
    public static void main(String[] args){
        clock clock=new clock();
        clock.star();
    }

}

