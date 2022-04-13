 
package Homework.Lesson8;
 

public class Circle {
    
    static final double Pi = 3.14;
    
    double calcAndShowCircleArea(double radius){
        double dCircleArea = Pi * radius * radius;
        System.out.println("Area of a circle with the radius R=" + radius
                + " is S=" + dCircleArea + ".");
        return dCircleArea;
    }
    

    static double calcCircumference(double radius){
        return calcAndShowCircumference(radius, false);
    }

    static double calcAndShowCircumference(double radius){
        return calcAndShowCircumference(radius, true);
    }
    
    private static double calcAndShowCircumference(double radius, 
            boolean bShow){
        double dCircumference = 2* Pi * radius;
        if (bShow){
            System.out.println("Circumference of a circle with the radius R=" 
                    + radius + "is L=" + dCircumference  + ".");
        }
        return dCircumference;
    }
    
    double info(double radius){
        calcAndShowCircleArea(radius);
        double dCircumference = 2* Pi * radius;
        System.out.println("\tIts circumference L=" + dCircumference  + ".");
        return dCircumference;
        
        
    }
    
}


class Lesson8_2Test {
    public static void main(String[] args) {
        
        double radius = 4.0d;
        double circumference = Circle.calcCircumference(radius);
        System.out.println("Circle.calcCircumference(" + radius
                + ")=" + circumference + ".");
        Circle.calcAndShowCircumference(radius);
        
        Circle circleInstance = new Circle();
        circleInstance.info(radius);
        
    }
}