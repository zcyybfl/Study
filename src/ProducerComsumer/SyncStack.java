package ProducerComsumer;

public class SyncStack {
    int index = 0;
    WoTou[] arrWT = new WoTou[6];
    public synchronized void push(WoTou wt){
        if (index == arrWT.length){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notify();
        arrWT[index] = wt;
        index++;
    }
    public synchronized WoTou pop(){
        if(index == 0){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        return arrWT[index];
    }
}
