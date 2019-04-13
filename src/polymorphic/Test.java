package polymorphic;

public class Test {
    public static void main(String[] args) {
        Cat c=new Cat("catname","blue");
        Dog d=new Dog("dogname","black");
        //Bird b=new Bird();
        Lady l1=new Lady("l1",c);
        Lady l2=new Lady("l2",d);
        //Lady l3=new Lady("l3",b);
        l1.myPetenjoy();
        l2.myPetenjoy();
        //l3.myPetenjoy();
    }
}
