import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class Exam extends Applet {

    public void init() {
        setSize(500,500);
        repaint();
    }

    public void paint(Graphics graphics) {

//        TextField textField = new TextField(20);
//        add(textField);

        graphics.setColor(Color.BLACK);
        graphics.drawRect(100, 100, 200, 200);
    }
}
