import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Demo02UDP_Send {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        DatagramSocket ds=new DatagramSocket();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        byte buf[]=str.getBytes();
        int length=buf.length;
        InetAddress address=InetAddress.getByName("10.20.148.162");
        int port=7879;
        DatagramPacket dp=new DatagramPacket(buf,length,address,port);
        try {
            ds.send(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}
