package LIU;
import java.io.*;
public class TestBufferStream1 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("E:\\Study\\src\\test\\test.java");
            BufferedInputStream bis = new BufferedInputStream(f);
            int c = 0;
            System.out.println(bis.read());
            System.out.println(bis.read());
            bis.mark(100);
            for (int i = 0;i<=10&&(c=bis.read())!=-1;i++){
                System.out.println((char)c+" ");
            }
            System.out.println();
            bis.reset();
            for (int i = 0;i<=10&&(c=bis.read())!=-1;i++){
                System.out.println((char)c+" ");
            }
            bis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
