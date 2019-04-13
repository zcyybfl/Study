package Socket.TestTalk;
import java.net.*;
import java.io.*;
public class TalkServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = null;
            try {
                server = new ServerSocket(4700);
            }catch (Exception e){
                e.printStackTrace();
            }
            Socket socket = null;
            try {
                socket = server.accept();
            }catch (Exception e){
                e.printStackTrace();
            }
            String line;
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(socket.getOutputStream());
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("对方说: "+is.readLine());
            line = sin.readLine();
            while (!line.equals("bye")){
                os.println(line);
                os.flush();
                System.out.println("我说: "+line);
                System.out.println("对方说: "+is.readLine());
                line = sin.readLine();
            }
            is.close();
            os.close();
            socket.close();
            server.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
