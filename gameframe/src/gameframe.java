import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class gameframe extends myframe {
    //Image desk=gameutil.getimages("image/desk.jpg");
  //  Image ball = gameutil.getimages("image/ball.png");
  //  plant plant = new plant(ball, 250, 250);

    //@Override
   /* public void paint(Graphics g) {

        //  g.drawImage(desk, 100, 100, null);
        // g.drawImage(ball, x, y, null);
        //   x++;
        plant.drawself(g);

    }*/

    class PaintThread extends Thread {
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

    public void launchFrame() {
        setSize(500, 500);
        setLocation(100, 100);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        new PaintThread().start();
  /*   @Override
        public void paint (Graphics g){

            g.drawImage(desk, 100, 100, null);
            g.drawImage(ball, 510, 350, null)
            ;

        }*/





    }

    public static void main(String[] args) {

    }
}
