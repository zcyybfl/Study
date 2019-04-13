package LIU;
import java.io.*;
import java.util.*;
public class TestPrintStream {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw = new FileWriter("E:/Test/Test1",true);
            PrintWriter log = new PrintWriter(fw);
            while ((s = br.readLine())!=null){
                if (s.equalsIgnoreCase("exit"))
                    break;
                System.out.println(s.toUpperCase());
                log.println("------");
                log.println(s.toUpperCase());
                log.flush();
            }
            log.println("***"+new Date()+"***");
            log.flush();
            log.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
