import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo10Bufferedwiter {
    public static void main(String[] args) {
        BufferedWriter witer=null;
        try {
            witer=new BufferedWriter(new FileWriter("out\\textIO\\Demo05.txt"));
            witer.write("adsgafafva");
            witer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
