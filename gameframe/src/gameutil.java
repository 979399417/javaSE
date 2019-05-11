import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class gameutil {
    public static Image getimages(String path) {
        URL u= (URL) gameutil.class.getClassLoader().getResource(path);
        BufferedImage img = null;
        try {
            img=ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return img;
    }
}
