package Interface2;

import TurtleGraphics.Pen;

public class Circle implements Shape{
    
    protected double xPos,yPos,radius;
    
    public Circle(){
        xPos = 0;
        yPos = 0;
        radius = 1;
    }
    public Circle(double x,double y,double r){
        xPos = x;
        yPos = y;
        radius =r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = 2*Math.PI * radius / 120;
        p.up();
        p.move(xPos,yPos);
        p.setDirection(0);
        p.move(radius);
        p.setDirection(90);
        p.down();
        for(int i = 1; i <=120; i++){
            p.move(side);
            p.turn(3);
        }
    }

    @Override
    public double getXpos() {
        return xPos;
    }

    @Override
    public double getYpos() {
        return yPos;
    }

    @Override
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    @Override
    public void stretchBy(double factor) {
        radius *= factor;
    }
    
    public String toString(){
        String str = "CIRCLE\n";
        str += "Radius = " + radius + "\n";
        str += "x Position = " + xPos + "\n";
        str += "y Position = " + yPos + "\n";
        return str;
    }
}
