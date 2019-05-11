import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Demo07TCP_Receive {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5599);
        System.out.println("未建立");
        Socket client = ss.accept();
        System.out.println("已建立");
        InputStream input = client.getInputStream();
        OutputStream output = client.getOutputStream();
       Thread t= new Thread() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    String str = scanner.nextLine();
                    if (str.equals("end")==true)
                    {
                        try {
                            ss.close();
                            client.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;}
                    try {
                        output.write(str.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
       t.setDaemon(true);
       t.start();
        byte buf[] = new byte[1024];
        int length =-1;
        while ((length = input.read(buf))!=-1) {
            String str = new String(buf, 0, length);
            System.out.println(str);
        }
        client.close();
        ss.close();

    }
}