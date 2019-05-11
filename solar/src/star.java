import java.awt.*;

public class star {
    Image img;
    double x,y;
    public void draw(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);
    }
    public star(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public star(String imgpath, double x, double y) {
        this.img = gameutil.getimages(imgpath);
        this.x = x;
        this.y = y;
    }


}
