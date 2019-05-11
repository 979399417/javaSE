import sun.nio.cs.ext.GBK;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Demo07outputstreamwiter {

    public static void main(String[] args) {
        OutputStreamWriter output=null;
        try {
            FileOutputStream fillputput=new FileOutputStream("out\\textIO\\Demo04.txt");
            output=new OutputStreamWriter(fillputput,"UTF-8");
       //     byte[]data=new byte[1024];
         //   String str=new String("sdgsdgsgsb s");
            output.write("sadagadgadg");
            output.write(new char[]{'的','e'});
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (output!=null)
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
