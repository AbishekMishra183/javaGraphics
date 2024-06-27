// Draw the flag of Nepal

import java.awt.*;

public class trafficPost extends Frame {
    trafficPost()
    {
        setSize(500, 500);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {

        super.paint(g);
      g.drawRect(100 , 100 , 100,300);
        g.setColor(Color.RED );
        g.fillOval(125 ,125, 40 ,40 );
        g.setColor(Color.yellow);
        g.fillOval(125 ,275, 40 ,40 );
        g.setColor(Color.green );
        g.fillOval(125 ,200, 40 ,40 );
        g.setColor(Color.black );
        g.drawLine(150, 400 ,150,800);
        g.drawLine(175,400,175,800);

}
    public static void main(String[] args) {
        new trafficPost();
    }
}