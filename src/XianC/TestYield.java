package XianC;

public class TestYield {
    public static void main(String[] args) {
        Mythread3 t1 = new Mythread3("t1");
        Mythread3 t2 = new Mythread3("t2");
        t1.start();
        t2.start();
    }
}
class Mythread3 extends Thread{
    Mythread3(String s){
        super(s);
    }
    public void run(){
        for (int i = 1;i<=100;i++){
            System.out.println(getName()+": "+i);
            if(i%10==0){
                yield();
            }
        }
    }
}
