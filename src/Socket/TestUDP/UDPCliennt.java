package Socket.TestUDP;
import java.net.*;
public class UDPCliennt {
    public static void main(String[] args) throws Exception{
        byte[] buf = (new String("hello")).getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5678));
        DatagramSocket ds = new DatagramSocket(9999);
        ds.send(dp);
        ds.close();
    }
}
