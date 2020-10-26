/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeProject;

import Interface2.*;
import TurtleGraphics.Pen;

/**
 *
 * @author Xavi8450
 */
public class wheel extends Circle{
    private double spokes;
    
    public wheel(){
        xPos=0;
        yPos=0;
        radius=0;
        spokes=3;
    }
    
    public wheel(double x, double y, double r, double s){
        super(x,y,r);
        spokes = s;
    }
    
    public void draw(Pen p){
        super.draw(p);
        for (int i = 0; i <= spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection(i * 360 / spokes);
            p.move(radius);
            
        }
    }
    public void setSpokes(int s){
        spokes = s;
    }
    
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    
    public String toString(){
        
        String str = "RECTANGLE\n";
        str += "Radius = " + radius + "\n";
        str += "x Position = " + xPos + "\n";
        str += "Number of spokes" + spokes + "\n";
        return str;
    }
}
