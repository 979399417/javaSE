import java.awt.*;
public class gameobject{

    Image img;
    static double speed=10;
    static   double degree=3.14/3;
    static  double x=100,y=100;
  //  int speed;
   static int width=500,heigh=500;
    public void drawself(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);

    }

    public gameobject(Image img, double x, double y, int speed, int width, int heigh) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.heigh = heigh;
    }

    public gameobject(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;

    }
    public gameobject(){

    }
    public Rectangle getRect(){
        return new Rectangle((int)x,(int)y,width,heigh);
        
    }
}
