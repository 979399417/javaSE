import java.awt.*;

public class plant extends gameobject {


    public void drawself(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);

        x+=gameobject.speed*Math.cos(degree);
        y+=gameobject.speed*Math.sin(degree);
       if(speed>0){
            speed-=0.1;
        }
        if(y>500-30||y<30){
            degree=-degree;
        }
        if(x>500-30||x<0){
            degree=Math.PI-degree;
        }


    }
    public plant(Image img,double x,double y){
        this.img=img;
        this.x=x;
        this.y=y;


    }
}
