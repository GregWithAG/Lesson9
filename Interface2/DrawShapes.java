
package Interface2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class DrawShapes {

    public static void main(String[] args) {
        Shape x = new Rect(0,0,200,75);
        Shape y = new Circle(50,50,100);
        Shape z = new wheel(0,0,250,200);
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        p.setColor(Color.red);
        p.setWidth(10);
        
        p.setColor(Color.green);
        
        p.setColor(Color.red);
        p.setWidth(2);
        z.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.println("press <enter> to move rectangle to -200,-200");
        s.nextLine();
        p.setColor(Color.white);
     
        x.move(-200, -200);
        p.setColor(Color.red);
        x.draw(p);
        
        System.out.println("Press <enter> to resize circle by 1/2");
        s.nextLine();
        p.setColor(Color.white);
        y.draw(p);
        y.stretchBy(0.5);
        p.setColor(Color.green);
        y.draw(p);
        
        System.out.println("Press <enter> to change wheel spokes");
        s.nextLine();
        p.setColor(Color.white);
        z.draw(p);
        ((wheel)z).setSpokes(3);
        p.setColor(Color.blue);
        z.draw(p);
    }
    
}
