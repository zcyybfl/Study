package LIU;
import java.io.*;
public class TestFileInputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        try {
            in = new FileInputStream("E:/Study/src/LIU/TestFileInputStream.java");
        }catch (FileNotFoundException e){
            System.out.println("找不到文件");
            System.exit(-1);
        }
        try {
            long num = 0;
            while ((b=in.read())!=-1){
                System.out.print((char)b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("共读取了"+num+"个字符");

        }catch (IOException el){
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}
