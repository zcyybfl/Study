package Socket;

import java.io.DataInputStream;
import java.net.*;

public class TCPServer {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        while (true) {
            Socket s = ss.accept();
          //  System.out.println("A Client connect!");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
        }
        }
}
