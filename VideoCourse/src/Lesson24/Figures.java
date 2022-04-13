 
package Lesson24;

public class Figures {
    public static void main(String[] args) {
        Figure f = new Square();
        System.out.println(f.nSides);
        System.out.println("BUT:");
        f.area();
    }
}

//ABSTRACT CLASS
abstract class Figure{
 
    int nSides = 0;
    
    Figure(int nSides){
        this.nSides = nSides;
    }
    
    abstract void perimeter();
    abstract void area();
    
    void showInfo(){
        System.out.println("This is a figure.");
    }
}

//CONCRETE CLASS 
class  Square extends Figure{
    int side1 = 10;
    int nSides = 4;
    
    Square(){
        super(4);
    }
    
    public void perimeter(){
        System.out.println("Perimeter of the square =" + 4*side1);
    }
    
    public void area(){
        System.out.println("Area of the square =" + side1*side1);
    }
}

class Rectangle extends Figure{
    int nSides = 4;
    int side1 = 10;
    int side2 = 8;
    
    
    public void perimeter(){
        System.out.println("Perimeter of the rectangle =" + 2*(side1+side2));
    }
    
    public void area(){
        System.out.println("Area of the rectangle =" + side1*side2);
    }
}

class XXXX extends Square {}


class Circle extends Figure {
    int nSides = 0;
    int radius = 3;
    
    
    
    public void perimeter(){
        System.out.println("Perimeter of the circle =" + 2*3.14*radius);
    }
    
    public void area(){
        System.out.println("Area of the circle =" + 3.14*radius*radius);
    }
}

abstract class Quadrilateral extends Figure{
    int nSides = 4;
    void def(){
        System.out.println("This is a quadrilateral");
    }
}
