
// Draw two triangles facing each other
import java.awt.*;

public class main3  extends Frame {
    main3() {
        setSize(500, 500);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        g.drawLine(100, 100, 100, 600); // vertical line of the flag

        g.drawLine(100, 300, 300, 500); //Second triangle ko tilted line

        g.drawLine(300, 500, 100, 500); //second triangle ko vitrw ayune line


        g.drawLine(100, 100, 300, 200); // first triangle ko tilted line

        g.drawLine(300, 200, 100, 300); // first triangle ko vitrw ayune line


}
    public static void main(String[] args) {
        new main3();
    }
}
