import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo9Bufferedreader {
    public static void main(String[] args) {
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader("out\\textIO\\Demo02.txt"));
            System.out.println(reader.readLine());
            char data[]=new char[1024];
            int length=reader.read(data);
//            String str=new String(data,0,length);
//            System.out.println(str);
           // System.out.println(new String(data,0,length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
