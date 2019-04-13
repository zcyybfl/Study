package FileList;
import java.util.*;
public class Filelist {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        ((ArrayList) c).add("hello");
        ((ArrayList) c).add(new Name("ds","d"));
        ((ArrayList) c).add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("ds","d")));
        System.out.println(c);
    }
}
class Name{
    private String firstName,lastName;
    public Name(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return firstName+" "+lastName;
    }
}
