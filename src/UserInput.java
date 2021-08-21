import java.applet.Applet;
import java.awt.*;

public class UserInput extends Applet
{
    String n;

    Label lab1;
    TextField t1;

    public void init()
    {
        lab1 = new Label("Enter a name");
        add(lab1);
        t1 = new TextField();
        add(t1);
    }

    public void paint(Graphics g)
    {
        g.drawString("Hello "+n,10,100);
    }

    public boolean action(Event e,Object o)
    {
        n = t1.getText();
        repaint();
        return true;
    }
}

