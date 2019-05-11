import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendThread extends Thread{
    private int port;

    public SendThread(int port) {
        this.port = port;
    }
    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            while (true) {
                ds = new DatagramSocket();
                Scanner s=new Scanner(System.in);
                String str=s.nextLine();
                if(str.equals("end"))break;
                byte buf[] = str.getBytes();
                int length = buf.length;
                InetAddress address = InetAddress.getByName("10.20.145.140");
                DatagramPacket dp = new DatagramPacket(buf, length, address, port);
                ds.send(dp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(ds!=null)
            ds.close();
        }
    }
}
