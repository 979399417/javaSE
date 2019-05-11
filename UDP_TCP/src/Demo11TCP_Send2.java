import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Demo11TCP_Send2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("10.20.145.140", 4555);
        InputStream input=s.getInputStream();
        OutputStream output=s.getOutputStream();
        new Thread(){
            @Override
            public void run() {
                int length=-1;
                byte buf[]=new byte[1024];
                while (true) {
                    try {
                        if(s.isClosed())break;
                        length=input.read(buf);
                        if (length==-1) break;
                        String str=new String(buf,0,length);
                        System.out.println(str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        Scanner scanner=new Scanner(System.in);
        while (true){
            String str=scanner.nextLine();
            if (str.equals("end")) {
                break;
            }
            output.write(str.getBytes());
        }
        s.close();
    }
}