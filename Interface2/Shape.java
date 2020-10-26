package Interface2;

import TurtleGraphics.Pen;

public interface Shape {
    public double area();
    public void draw(Pen p);
    public double getXpos();
    public double getYpos();
    public void move(double xLoc, double yLoc);
    public void stretchBy(double factor);
    
}
