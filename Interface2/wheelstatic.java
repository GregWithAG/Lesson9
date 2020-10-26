package Interface2;

import ShapeProject.wheel;

public class wheelstatic {


    public static void main(String[] args) {
        wheel x,y,z;
        x = new wheel();
        y = new wheel(10,10,50,5);
        z = new wheel(10,10,100,3);
        System.out.println(x);
        System.out.println("\n" + y);
        System.out.println("\n" + z);
        System.out.println("-----------");
    }
    
}
