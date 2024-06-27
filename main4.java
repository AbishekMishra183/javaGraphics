
// Draw a PacMan Face with dots
import java.awt.*;

public class main4  extends Frame {

    main4() {
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
    g.fillArc(300,200,100,150,30,300);
        g.drawOval(375,250,30,30);
        g.drawOval(420,250,20,20);
        g.drawOval(470,250,10,10);


    }
    public static void main(String[] args)
    {
       new main4();
    }
}
