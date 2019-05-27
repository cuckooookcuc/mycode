package InternetDemo;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class PortTest {
    public static void main(String[] String)
    {
        InetSocketAddress inetSocketAddress=new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress inetSocketAddress1=new InetSocketAddress("localhost",9000);
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress1.getAddress());
    }
}
