import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Bufferintputstream {
    public static void main(String[] args) {
        BufferedInputStream intput=null;
        try {
            intput=new BufferedInputStream(new FileInputStream("out\\textIO\\Demo04.txt"));
            int length=-1;
            byte[]data=new byte[1024];
            length=intput.read(data);
//           while ((length=intput.read(data))!=-1)
//            {
//                for (int i=0;i<length;i++){
//               System.out.print((char)data[i]);
//               }
//            }
            String srt=new String(data,0,length);
            System.out.println(srt);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void testbufferintputstream(){
        BufferedInputStream intput=null;
        try {
            intput=new BufferedInputStream(new FileInputStream("out\\textIO\\Demo04.txt"));
            int length=-1;
            byte[]data=new byte[4];
            while ((length=intput.read(data))!=-1)
            {
               for (int i=0;i<length;i++){
                   System.out.println((char)data[i]);
               }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
