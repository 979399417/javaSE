import java.util.Timer;
import java.util.TimerTask;

public class Demo05Timertask {
    public static void main(String[] args) {
        Timer t=new Timer();
        t.schedule(new mytimeertask(),2000,3000);
        t.cancel();


    }
}
class mytimeertask extends TimerTask{
    @Override
    public void run() {
        System.out.println("定时器任务");

    }
}