import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class HutDrawing extends Frame {

   public HutDrawing() {
      super("Hut Drawing");
      setSize(600, 400);
      setVisible(true);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }
      });
   }

   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      
      // Draw top of the hut
      int[] xPoints = {150, 300, 500, 100};
      int[] yPoints = {100, 50, 100, 100};
      g2.setColor(Color.ORANGE);
      g2.fillPolygon(xPoints, yPoints, 4);
      
      // Draw body of the hut
      Rectangle2D.Double rectangle = new Rectangle2D.Double(100, 100, 400, 200);
      g2.setColor(Color.YELLOW);
      g2.fill(rectangle);
      
      // Draw door of the hut
      Rectangle2D.Double door = new Rectangle2D.Double(275, 200, 50, 100);
      g2.setColor(Color.GREEN);
      g2.fill(door);
      
      // Draw windows of the hut
      Ellipse2D.Double window1 = new Ellipse2D.Double(150, 150, 50, 50);
      Ellipse2D.Double window2 = new Ellipse2D.Double(400, 150, 50, 50);
      g2.setColor(Color.CYAN);
      g2.fill(window1);
      g2.fill(window2);
      
      // Draw pond in front of the hut
      Ellipse2D.Double pond = new Ellipse2D.Double(200, 300, 200, 50);
      g2.setColor(Color.BLUE);
      g2.fill(pond);
   }

   public static void main(String[] args) {
      new HutDrawing();
   }
}
