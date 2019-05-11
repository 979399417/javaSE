import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receive02Thread extends Thread {
    private int port;

    public Receive02Thread(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        DatagramSocket ds=null;
        try {
            ds = new DatagramSocket(port);
            while (true) {
                byte buf[] = new byte[1024];
                int length = buf.length;
                DatagramPacket dp = new DatagramPacket(buf, length);
                ds.receive(dp);
                String str = new String(dp.getData(), 0, length);
                InetAddress adress = dp.getAddress();
                System.out.println(adress + ":" + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ds != null)
                ds.close();
        }

    }

}



