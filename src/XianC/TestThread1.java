package XianC;

public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        //r.run();
         Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread:" + i);
        }
    }
}
class Runner1 implements Runnable{
    public  void run(){
        for (int i = 0;i<100;i++){
            System.out.println("Runeer1:"+i);
        }
    }

}
