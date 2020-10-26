package ShapeProject;

import TurtleGraphics.Pen;

public class Triangle extends Shape{

    private double length;
    private double width;
    private double x1,x2,x3,y1,y2,y3;
    
    public Triangle(){
        super();
        x2 = x3 = y2 = y3;
    }
    
    
    public Triangle(double x,double y,double X2,double Y2,double X3,double Y3){
        super(x,y);
        x2 = X2;
        x3 = X3;
        y2 = Y2;
        y3 = Y3;
    }
    
    @Override
    public double area() {
        return Math.abs((x1*y2-x2*y1) + (x2*y3-x3*y2) + (x3*y1-x1*y3)) / 2;
        
    }
    
    public void move(double xLoc, double yLoc) {
        x1 += xLoc;
        y1 += yLoc;
        x2 += xLoc;
        y2 += yLoc;
        x3 += xLoc;
        y3 += yLoc;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(x1, y1);
        p.down();
        p.move(x3, y3);
        p.move(x2, y2);
        p.move(x1, y1);
    }

    @Override
    public void stretchBy(double factor) {
        x1 *= factor;
        y1 *= factor;
        x2 *= factor;
        y2 *= factor;
        x3 *= factor;
        y3 *= factor;
    }
    public String toString(){
        String str = "Triangle\n";
        str += "point 1 = "  + x1 + "," + y1 + "\n";
        str += "point 2 = "  + x2 + "," + y2 + "\n";
        str += "point 3 = "  + x3 + "," + y3 + "\n";
        return str;
    }
    
}
