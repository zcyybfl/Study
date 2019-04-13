package Count3quit;

public class KidCircle {
    int count = 0;
    Kid first,last;
    KidCircle(int n){
        for(int i=0;i<n;i++){
            add();
        }
    }
    void add(){
        Kid k = new Kid();
        k.id=count;
        if (count<=0){
            k.left=k;
            k.right=k;
            last=k;
            first=k;
        }else {
            last.right=k;
            first.left=k;
            k.left=last;
            k.right=first;
            last=k;
        }
        count++;
    }
    void delete(Kid k){
        if(count<=0){
            return;
        }else if (count==1){
            first=last=null;
        }else{
            k.right.left=k.left;
            k.left.right=k.right;
            if(k==first){
                first=k.right;
            }else if(k==last){
                last=k.left;
            }
        }
        count--;
    }
}
