import java.io.*;

public class Demo04Bufferoutputstream {

         public void testbufferoutputstream(){
             BufferedOutputStream output = null;
             try {
                 output= new BufferedOutputStream(new FileOutputStream("out\\textIO\\Demo02.txt"));
                 output.write('a');
                 output.write('a');
                 output.write('a');
               //  char[]date=new char[1024];
                 String srt="adgsdgsfhbsbs";
                 output.write(srt.getBytes());

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

    public static void main(String[] args) {
        BufferedOutputStream output = null;
        try {
            output= new BufferedOutputStream(new FileOutputStream("out\\textIO\\Demo04.txt"));
            output.write('a');
            output.write('a');
            output.write('a');
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                if(output!=null)
//                output.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
    }

