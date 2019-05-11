import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo13TCP_Server2 {
    public static void main(String[] args) {
        new conection().start();;
    }
}
   class conection extends Thread {
       @Override
       public void run() {
           ServerSocket ss=null;
           {
               try {
                   ss = new ServerSocket(5593);
                   Socket s = ss.accept();
                   System.out.println("已建立连接");
                   new   ClientThread(s).start();

               } catch (Exception e) {
                   e.printStackTrace();
               }
               try {
                   ss.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }

           }


       }

        }
        class ClientThread  extends Thread{
       private Socket s;

            public ClientThread(Socket s) {
                this.s = s;
            }

            @Override
            public void run() {
                try {
                    while (true) {
                        InputStream inputStream = s.getInputStream();
                        int length = -1;
                        byte buf[] = new byte[1024];
                        length=inputStream.read(buf);
                        if(length==-1)break;
                        String str=new String(buf,0,length);
                        System.out.println(str);

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
