import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo10pracite02UDP {
    public static void main(String[] args) {
        DatagramSocket ds=null;
        try {
            ds=new DatagramSocket(6699);
            while (true){
            byte[]buf=new byte[1024];
            int length=buf.length;
            DatagramPacket dp=new DatagramPacket(buf,length);
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,length));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
