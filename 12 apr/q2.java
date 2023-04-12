import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class q2{

    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.add(new Label("Input 1"));
        f.add(new TextField(10));
        f.add(new Label("Input 2"));
        f.add(new TextField(10));
        f.add(new Label("Result"));
        f.add(new TextField(10));
        f.add(new Button("Add"));
        f.add(new Button("Sub"));
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
