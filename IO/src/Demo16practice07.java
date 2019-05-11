import org.omg.CORBA.portable.OutputStream;

import java.io.*;

public class Demo16practice07 {

    public static void main(String[] args)  {

        try {
            File f = new File("out\\textIO\\BC\\Demo01.txt");
            if(!f.exists()){
                f.getParentFile().mkdirs();
            }
//            BufferedOutputStream outputStream= null;
//            FileOutputStream fileOutputStream=new FileOutputStream(f);
//            outputStream = new BufferedOutputStream(fileOutputStream);
            FileOutputStream outputStream=new FileOutputStream(f);
           outputStream.write("afasfasfgasf".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
