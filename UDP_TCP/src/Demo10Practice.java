import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Demo10Practice {
    public static void main(String[] args) {
        DatagramSocket ds=null;
        {
            try {
                ds = new DatagramSocket();
                InetAddress adress=InetAddress.getByName("10.20.149.194");
                Scanner scanner=new Scanner(System.in);
                while (true) {
                    byte buf[] = scanner.nextLine().getBytes();
                    int length = buf.length;
                    DatagramPacket dp = new DatagramPacket(buf, length, adress, 6699);
                    ds.send(dp);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (ds!=null)
                    ds.close();
            }
        }
    }
}