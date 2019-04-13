package ProducerComsumer;

public class Producer implements Runnable{
    SyncStack ss = null;
    Producer(SyncStack ss){
        this.ss = ss;
    }
    public void run(){
        for (int i = 0;i<20;i++){
            WoTou wt = new WoTou(i);
            ss.push(wt);
            System.out.println("生产了: "+wt);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
