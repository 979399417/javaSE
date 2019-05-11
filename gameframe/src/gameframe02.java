import java.awt.*;

public class gameframe02 extends myframe
{
    //Image desk=gameutil.getimages("image/desk.jpg");
    Image ball=gameutil.getimages("image/ball.png");
   Image SUN=gameutil.getimages("image/sun.jpg");
    plant plant=new plant(ball,250,250);
 //   plant s=new plant(SUN,0,0);

    @Override
    public void paint (Graphics g){


        plant.drawself(g);
     //   g.drawself(g);
       // g.drawImage(SUN,0,0,null);

    }




    public static void main(String[] args) {
        gameframe02 gf=new gameframe02();
        gf.launchFrame();





    }
}
