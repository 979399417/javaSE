import java.io.*;

public class Demo06practice02 {
    public static void main(String[] args) {
        Demo06practice02 a=new Demo06practice02();
        long srat=System.currentTimeMillis();
        a.testcopy("out\\textIO\\Demo04.txt","out\\textIO\\Demo06.txt");
        long end=System.currentTimeMillis();
        System.out.println(end-srat);
        srat=System.currentTimeMillis();
        a.testcopy02("out\\textIO\\Demo04.txt","out\\textIO\\Demo07.txt");
        end=System.currentTimeMillis();
        System.out.println(end-srat);

//        BufferedInputStream input=null;
//        BufferedOutputStream output=null;
//        try {
//            input=new BufferedInputStream(new FileInputStream("out\\textIO\\Demo04.txt"));
//            output=new BufferedOutputStream(new FileOutputStream("out\\textIO\\Demo05.txt"));
//            byte data[]=new byte[1024];
//            int length=input.read(data);
////            while ((length=input.read(data))!=-1){
////                output.write(data,0,length);
////            }
//            String str=new String(data,0,length);
//            output.write(str.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//                finally {
//                if (output!=null){
//                    try {
//                        output.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            if (input!=null){
//                try {
//                    input.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            }

    }
    public void testcopy(String sourcename,String tragename){
        BufferedInputStream input=null;
        BufferedOutputStream output=null;
        try {
            input=new BufferedInputStream(new FileInputStream(sourcename));
            output=new BufferedOutputStream(new FileOutputStream(tragename));
            int length=-1;
            byte data[]=new byte[1024];
            while ((length=input.read(data))!=-1){
                output.write(data);
            }
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
            if (input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void testcopy02(String sourcename,String tragename){
        BufferedInputStream input=null;
        BufferedOutputStream output=null;
        try {
            input=new BufferedInputStream(new FileInputStream(sourcename));
            output=new BufferedOutputStream(new FileOutputStream(tragename));
            byte data[]=new byte[1024];
            int length=input.read(data);
//            while ((length=input.read(data))!=-1){
//                output.write(data,0,length);
//            }
            String str=new String(data,0,length);
            output.write(str.getBytes());
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
            if (input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
