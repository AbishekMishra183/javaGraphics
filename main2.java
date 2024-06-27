// Draw three dotted lines with gap in between

import java.awt.*;

public class main2 extends Frame {

    main2() {
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // draw lines
        g.drawLine(100, 100, 400, 100);
        g.drawLine(100, 120, 400, 120);
        g.drawLine(100, 200, 400, 200);
        g.drawLine(100, 220, 400, 220);
        g.drawLine(500, 100, 800, 100);
        g.drawLine(500, 120, 800, 120);
        g.drawLine(500,140,800,140);

        g.drawLine(500,200,800,200);
        g.drawLine(500,220,800,220);
        g.drawLine(500,250,800,250);

    }

    public static void main(String[] args) {
        new main2();
    }
}
