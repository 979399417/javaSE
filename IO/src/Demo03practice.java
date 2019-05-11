import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//用inputoutputstream复制文本        字节（符）数组方法
public class Demo03practice {
    public static void textcopy(){
        copy("out\\textIO\\Demo01.txt","out\\textIO\\Demo03.txt");
    }
    public static void copy(String sourcename,String targename){
        FileInputStream input = null;
        FileOutputStream output=null;
        try {
            input = new FileInputStream(sourcename);
            output=new FileOutputStream(targename);
            byte date[] = new byte[1024];
            while (true) {
                int length=input.read(date);
                if (length == -1) break;
//                for (int i = 0; i < leng; i++) {
//                    output.write((char)d[i]);
//                }
              //  String str=new String(date,0,leng);
                output.write(date,0,length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(output!=null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static void main(String[] args) {
    //    Demo03practice a=new Demo03practice();
        long star=System.currentTimeMillis();
        textcopy();
        long end=System.currentTimeMillis();
        System.out.println(end-star);

//        FileInputStream input = null;
//        FileOutputStream output=null;
//        try {
//            input = new FileInputStream("out\\textIO\\Demo01.txt");
//            output=new FileOutputStream("out\\textIO\\Demo02.txt");
//            byte d[] = new byte[4];
//
//            while (true) {
//                int leng=input.read(d);
//                if (leng == -1) break;
//                for (int i = 0; i < leng; i++) {
//                    output.write((char)d[i]);
//
//                   // System.out.print((char) d[i]);
//                }
////                String str=new String(d,0,leng);
////                System.out.print(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if(input!=null){
//                try {
//                    input.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(output!=null){
//                try {
//                    output.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//
//        }
    }
}
