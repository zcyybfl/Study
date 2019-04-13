package LIU;
import java.io.*;
public class TestObjectIO {
    public static void main(String[] args)throws Exception {
        T t = new T();
        t.k = 8;
        FileOutputStream fos = new FileOutputStream("E:/Test/test3.txt");
        ObjectOutputStream ois = new ObjectOutputStream(fos);
        ois.writeObject(t);
        ois.flush();
        ois.close();
        FileInputStream fis = new FileInputStream("E:/Test/test3.txt");
        ObjectInputStream oos = new ObjectInputStream(fis);
        T tReaded = (T)oos.readObject();
        System.out.println(tReaded.i+" "+tReaded.j+" "+tReaded.d+" "+tReaded.k);
    }
}
class T
implements Serializable
{
    int i = 0;
    int j = 9;
    double d = 2.3;
    int k =0;
}
