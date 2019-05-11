import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo01InetAdders {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress I=InetAddress.getByName("DESKTOP-SOOSV95");
        //InetAddress I=InetAddress.getByName("10.20.148.162");



        System.out.println(I);
    }
}
