 
package Lesson25;

 
public class Cars {
    
}

class Car{
    static int a = 5;
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("c.a" + c.a);
        c = null;
        //ok because real object is not checked
        System.out.println("c.a" + c.a); //a belongs to a class, not to an Object.
        
    }
}
