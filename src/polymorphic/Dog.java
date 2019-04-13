package polymorphic;

public class Dog extends Animal {
    public String furColor;
    Dog(String n,String c){
        super(n);
        furColor=c;
    }
    public void enjoy(){
        System.out.println("狗叫声...");
    }
}
