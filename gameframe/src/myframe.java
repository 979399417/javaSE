import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class myframe extends Frame {
    public void launchFrame() {
        setSize(gameobject.width, gameobject.heigh);
        setLocation(100, 100);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        new gameframe02.PaintThread().start();



    }
    class PaintThread extends Thread{
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
