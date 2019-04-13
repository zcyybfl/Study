package Count3quit;

public class count3quit {
    public static void main(String[] args) {
        KidCircle k=new KidCircle(500);
        int num=0;
        Kid kc=k.first;
        while(k.count>1){
            num++;
            if(num==3){
                num=0;
                k.delete(kc);
            }
            kc=kc.right;
        }
        System.out.println(k.last.id);
    }
}
