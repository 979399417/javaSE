import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
public class Demo08inputStreamreader {
    public static void main(String[] args) {
        InputStreamReader reader=null;
        try {
            reader=new InputStreamReader(new FileInputStream("out\\textIO\\Demo02.txt"));
            char data[]=new char[1024];
            int length=-1;
            length=reader.read(data);
            String str=new String(data,0,length);
            System.out.println(str);

//            while ((length=reader.read(data))!=-1){
//                System.out.println(data);
//
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void tesrreader() {
        InputStreamReader reader=null;
        try {
            reader=new InputStreamReader(new FileInputStream("out\\textIO\\Demo01.txt"),"UTF-8");
            char data[]=new char[1024];
            int length=-1;
            length=reader.read(data);
            String str=new String(data,0,length);
            System.out.println(str);

//            while ((length=reader.read(data))!=-1){
//                System.out.println(data);
//
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
