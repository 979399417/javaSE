import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo02 {
    public static void main(String[] args) {
        OutputStream output=null;
        try {
            output=new FileOutputStream("out\\textIO\\Demo02.txt");
            String str="你好world";
            output.write(str.getBytes());
            byte[]date=new byte[4];
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (output!=null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void outputstream(){
        OutputStream output=null;
        try {
            output=new FileOutputStream("out\\textIO\\Demo01.txt");
            output.write('s');
            output.write('s');
            output.write('s');
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (output!=null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        }