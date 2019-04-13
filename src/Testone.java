import java.awt.*;
public class Testone {
    public static void main(String[] args) {
        new A("abc",300,300,400,300,Color.BLUE);
    }
}
class A extends Frame{
    private Panel p1;
    A(String s,int x,int y,int w,int h,Color c){
        super(s);
        setBounds(x,y,w,h);
        setBackground(c);
        p1 = new Panel(null);
        p1.setBounds(w/4,h/4,w/2,h/2);
        p1.setBackground(Color.yellow);
        add(p1);

        setVisible(true);
    }
}