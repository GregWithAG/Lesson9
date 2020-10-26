package ShapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class Shapetester {

    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        
        Shape a = new wheel(100,100,50,5);
        a.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to change");
        s.nextLine();
        p.setColor(Color.white);
        a.draw(p);
        a = makeOneShapeFromAnother(a,1);
        Shape b = new Rect();
        
        Circle c = new wheel();
        Circle cc = new Circle();
        
        wheel w = new wheel();
        
        System.out.println("is c a Shape -> " + (c instanceof Shape));
        System.out.println("is c a Circle -> " + (c instanceof Circle));
        System.out.println("is c a Wheel -> " + (c instanceof Shape));
        System.out.println("is w a Circle -> " + (w instanceof Shape));
        System.out.println("is cc a Wheel -> " + (cc instanceof wheel));
        
        
    }
    public static Shape makeOneShapeFromAnother(Shape inShape, int type){
        Shape outShape;
        if(type==1){
            double area = inShape.area();
            return new Rect(inShape.getXpos(),inShape.getYpos(),
                    Math.sqrt(area),Math.sqrt(area));
        }
        else if(type==2){
            double area = inShape.area();
            double rad = Math.sqrt(Math.PI / area);
            return new Circle(inShape.getXpos(),inShape.getYpos(),rad);
        }
        else{
            double area = inShape.area();
            double rad = Math.sqrt(Math.PI / area);
            return new Circle(inShape.getXpos(),inShape.getYpos(),rad);
        }
    }
    
}
