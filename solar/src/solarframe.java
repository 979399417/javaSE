import java.awt.*;

public class solarframe extends myframe {
    Image sun=gameutil.getimages("image/sun.jpg");
    Image ball=gameutil.getimages("image/ball.png");

   star ball1=new star(ball,100,100);
    public void paint(Graphics g){
        g.drawImage(sun,0,0,null);
        ball1.draw(g);

    }

    public static void main(String[] args) {
        new solarframe().launchFrame();
    }
}
