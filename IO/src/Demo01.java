import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        FileInputStream inpu=null;
        try {
            inpu=new FileInputStream("out\\textIO\\Demo01.txt");
            byte d[]=new byte[4];
            int leng;
            while ((leng = inpu.read(d))!=-1) {
               // if(leng==-1)break;
                for (int i = 0; i < leng; i++) {

                    System.out.print((char)d[i]);
                }
//                String str=new String(d,0,leng);
//                System.out.print(str);
            }
            System.out.println("*********************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        FileInputStream input=null;
//        try {
//            input=new FileInputStream("out\\textIO\\Demo01.txt");
//            byte[] date=new byte[4];
//            while (true){
//          int length=input.read(date);
//          if(length==-1)
//              break;
//          for (int i=0;i<length;i++){
//             System.out.print((char)date[i]);
//          }
//            }
//         /*  int a=-1;
//         while (true) {
//               a = input.read();
//               if (a == -1) break;*/
//          //     System.out.print((char) a);
////           System.out.println((char)a);
////             a=input.read();
////            System.out.println((char)a);
////             a=input.read();
////            System.out.println((char)a);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        FileInputStream file=null;
        try {
            file=new FileInputStream("out\\textIO\\Demo01.txt");
            byte []Date=new byte[4];

            while(true){
                int len=file.read(Date);
                if(len==-1)
                    break;
                for (int i=0;i<len;i++){
                    System.out.print((char)Date[i]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void textFileInputStream(){
        try {
            FileInputStream input = new FileInputStream("textIO\\Demo01.txt");
            int a=input.read();
            System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
