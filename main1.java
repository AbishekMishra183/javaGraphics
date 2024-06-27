//. Draw two triangles facing each other

import java.awt.*;

import static java.awt.Color.red;

public class main1 extends Frame {

    main1() {
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
       g.drawLine(100,100,50,300);
       g.drawLine(50,300,100,400);
       g.drawLine(100, 100,100,400);
       g.drawLine(100,400,500,500);
       g.drawLine(100,400,100,500);
       g.drawLine(100,500,500,500);

    }
    public static void main(String[] args) {
        new main1();
    }
}



