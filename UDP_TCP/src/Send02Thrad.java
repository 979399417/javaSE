import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Send02Thrad extends Thread {
    private int port;

    public Send02Thrad(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        DatagramSocket ds=null;
        try {
             while (true) {
                 ds=new DatagramSocket();
                 Scanner scanner=new Scanner(System.in);
                 String str=scanner.nextLine();
                 byte buf[] = str.getBytes();
                 int length = buf.length;
                 InetAddress adaress = InetAddress.getByName("10.20.145.140");
                 DatagramPacket dp = new DatagramPacket(buf, length, adaress, port);
                 ds.send(dp);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(ds!=null){
                ds.close();
            }
        }
    }
}
