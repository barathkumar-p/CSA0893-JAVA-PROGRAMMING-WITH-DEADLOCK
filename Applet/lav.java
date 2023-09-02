import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class lav extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {150, 175, 200, 150, 100, 125};
        int[] yPoints = {100, 50, 100, 175, 100, 175};

        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 6);
        g.fillArc(100, 75, 75, 75, 0, 180);
        g.fillArc(175, 75, 75, 75, 0, 180);
    }
}
