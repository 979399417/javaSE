import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo08Server {
    public static void main(String[] args) {
        new connectionThread().start();
    }
    }class connectionThread extends Thread {
        @Override
        public void run() {
            ServerSocket ss = null;
            try {
                ss = new ServerSocket(5215);
                while (true) {
                    Socket s = ss.accept();
                    System.out.println("建立一个连接" + s.getInetAddress());
                    new ClientThrad(s).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (ss != null) {
                    try {
                        ss.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    class ClientThrad extends Thread{
    private Socket s;
        public ClientThrad(Socket s) {
            this.s = s;
        }
        @Override
        public void run() {
            try {
                InputStream input=s.getInputStream();
                byte buf[]=new byte[1024];
                int length=-1;
                while ((length=input.read(buf))!=-1){
                    System.out.println(new String(buf,0,length));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {

            }
        }
    }

