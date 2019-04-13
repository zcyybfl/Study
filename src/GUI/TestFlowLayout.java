package GUI;
import java.awt.*;
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame f = new Frame("zc");
        FlowLayout l = new FlowLayout(FlowLayout.CENTER,20,40);
        f.setLayout(l);
        f.setLocation(300,400);
        f.setSize(300,200);
        f.setBackground(Color.black);
        for(int i = 0;i<6;i++){
            f.add(new Button("i"));
        }
        f.setVisible(true);
    }
}
