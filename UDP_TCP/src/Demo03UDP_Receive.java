import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo03UDP_Receive {
    public static void main(String[] args) throws SocketException {
        byte buf[]=new byte[1024];
        int length=buf.length;
        DatagramSocket ds=new DatagramSocket(7879);
        DatagramPacket dp=new DatagramPacket(buf,length);
        try {
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,length));
            InetAddress adress=dp.getAddress();
//            System.out.println(adress);
//            System.out.println(dp.getPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            ds.close();
        }
    }
}
