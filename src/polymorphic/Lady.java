package polymorphic;

public class Lady {
    private String name;
    private Animal pet;
    Lady(String name,Animal pet){
        this.name=name;
        this.pet=pet;
    }
    public void myPetenjoy(){
        pet.enjoy();
    }
}
