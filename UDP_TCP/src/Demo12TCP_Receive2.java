import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Demo12TCP_Receive2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(4555);
        Socket s=ss.accept();
        OutputStream outputStream=s.getOutputStream();
        InputStream inputStream=s.getInputStream();
        Scanner scanner=new Scanner(System.in);
        new Thread(){
            @Override
            public void run() {
                while (true){
                    String str=scanner.nextLine();
                    if(str.equals("end")){
                        try {
                            ss.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        outputStream.write(str.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        while (true) {
            int length = -1;
            byte buf[] = new byte[1024];
            length=inputStream.read(buf);
            if (length==-1)break;
            String str=new String(buf,0,length);
            System.out.println(str);
        }
    }
}
