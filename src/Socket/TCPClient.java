package Socket;
import java.net.*;
import java.io.*;
import java.util.*;
public class TCPClient {
    public static void main(String[] args)throws Exception {
        Scanner b = new Scanner(System.in);
        String a;
        a=b.next();
        Socket s = new Socket("127.0.0.1",6666);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF(a);
        dos.flush();
        dos.close();
        os.close();
    }
}
