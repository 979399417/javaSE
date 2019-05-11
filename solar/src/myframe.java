import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myframe extends Frame {
    Image ball=gameutil.getimages("image/sun.jpg");
    public void launchFrame() {
        setSize(500,500);
        setLocation(100, 100);
        setVisible(true);
        new PaintThread().start();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
     // new solarframe().launchFrame();
       ;



    }
    class PaintThread extends Thread{
        @Override
        public void run() {
            while (true){
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
