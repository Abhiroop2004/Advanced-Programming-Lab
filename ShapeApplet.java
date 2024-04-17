import java.applet.*;
import java.awt.*;

public class ShapeApplet extends Applet 
{
    public void paint(Graphics g) 
    {

        setBackground(Color.lightGray);
        g.drawString("Welcome to Shape Applet", 20, 20);

        // circle
        g.setColor(Color.red);
        g.fillOval(50, 50, 100, 100);

        // oval
        g.setColor(Color.blue);
        g.fillOval(200, 50, 120, 80);

        // square
        g.setColor(Color.green);
        g.fillRect(50, 200, 100, 100);

        // rectangle
        g.setColor(Color.orange);
        g.fillRect(200, 200, 150, 80);
    }
}
