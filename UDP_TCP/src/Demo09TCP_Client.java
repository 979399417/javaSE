import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Demo09TCP_Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("10.20.149.69", 5593);
        Scanner scanner = new Scanner(System.in);
        s.getOutputStream().write(scanner.nextLine().getBytes());
        s.close();
    }
}