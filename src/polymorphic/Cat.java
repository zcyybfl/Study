package polymorphic;

public class Cat extends Animal {
    private String eyescolor;
    Cat(String n,String c){
        super(n);
        eyescolor = c;
    }
    public void enjoy(){
        System.out.println("猫叫声..");
    }
}
