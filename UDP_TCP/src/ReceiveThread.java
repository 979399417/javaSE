import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveThread extends  Thread {
    private int port;

    public ReceiveThread(int port) {
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
              //  System.out.println(new String(dp.getData(), 0, length));
                String str=new String(dp.getData(), 0, length);
                InetAddress adress = dp.getAddress();
               // System.out.println(adress);
                System.out.println(adress+":"+str);
            }
            } catch(IOException e){
                e.printStackTrace();
            }
        finally {
            if(ds!=null)
            ds.close();
        }
        }
    }
