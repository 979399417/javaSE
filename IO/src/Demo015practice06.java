import java.io.*;
import java.lang.reflect.Field;

public class Demo015practice06 {
    //拆分文件
    public static void main(String[] args) throws Exception {

//        BufferedInputStream inputStream=null;
//        inputStream=new BufferedInputStream(new FileInputStream("out\\textIO\\201835010144杨景.pptx"));
//        int size=100*1024;
//        byte buf[]=new byte[size];
//        int length=-1;
//        int i=0;
//        while ((length=inputStream.read(buf))!=-1){
//            BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream("out\\textIO\\201835010144杨景"+(i++)+".rar"));
//            outputStream.write(buf,0,length);
//        }






//拆分文件
//        BufferedInputStream Input=new BufferedInputStream(new FileInputStream("out\\textIO\\201835010144杨景.pptx"));
//        int i=0;
//
//        int size=1024*100;
//        byte buf[]=new byte[size];
//        int length=-1;
//        while ((length=Input.read(buf))!=-1){
//            BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream("out\\textIO\\201835010144杨景."+(i++)+".rar"));
//            output.write(buf,0,length);
//        }
        //合并文件
        BufferedInputStream input=null;
        


//
//}
//
//}


//        BufferedInputStream inputStream=new BufferedInputStream(new FileInputStream("out\\textIO\\201835010144杨景.pptx"));
//        BufferedOutputStream outputStream=null;
//        int size=100*1024;
//        int length=-1;
//        int i=0;
//        byte buf[]=new byte[size];
//        while ((length=inputStream.read(buf))!=-1){
//            outputStream=new BufferedOutputStream(new FileOutputStream("out\\textIO\\201835010144杨景.pptx"+(i++)+".rar"));
//            outputStream.write(buf,0,length);
//            outputStream.close();
//        }
//        inputStream.close();


//合并文件
//        BufferedInputStream inputStream = null;
//        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("out\\textIO\\201835010144杨景.rar"));
//        int size = 1024 * 100 * 1024;
//        int i = 0;
//        while (true) {
//            File f = new File("out\\textIO\\201835010144杨景" + (i++) + ".rar");
//            if (!f.exists()) {
//                System.out.println(i);
//                break;
//            }
//            inputStream = new BufferedInputStream(new FileInputStream(f));
//            byte buf[] = new byte[size];
//            int length = -1;
//            while ((length = inputStream.read(buf, 0, size)) != -1) {
//                outputStream.write(buf, 0, length);
//            }
//        }
    }
}