package Interface2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class DrawShapes2 {

    public static void main(String[] args) {
        
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        p.setWidth(3);
        Shape shapes[] = new Shape[150];
        for (int i = 0; i < 150; i++) {
            shapes[i] = getRandom();
            p.setColor(getRandomC());
            shapes[i].draw(p);
            System.out.println(shapes[i]);
            System.out.println("----------");
        }
        
    }
    

    public static Color getRandomC(){
        int rr, rb, rg;
        rb = (int)(Math.random() * 256);
        rg = (int)(Math.random() * 256);
        rr = (int)(Math.random() * 256);
        return new Color(rr,rb,rg);
    }
    public static Shape getRandom(){
        Shape s;
        int rx,ry,rr,rw,rh,rs,randshp;
        rx = (int)(Math.random() * 600 - 300);
        ry = (int)(Math.random() * 600 - 300);
        rr = (int)(Math.random() * 200 + 10);
        rw = (int)(Math.random() * 250 + 10);
        rh = (int)(Math.random() * 250 + 10);
        rs = (int)(Math.random() * 120 + 3);
        randshp = (int)(Math.random() * 3 + 1);
        if(randshp == 1)
            s=new Rect(rx,ry,rw,rh);
        else if(randshp == 2)
            s=new Circle(rx,ry,rr);
        else
            s=new wheel(rx,ry,rr,rs);
        return s;
    }
}