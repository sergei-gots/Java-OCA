 
package Homework.Lesson10.p4.p5;

 
public class E {
    
    public E(){
        System.out.println("Welcome to a constructor of the class E");
        info();
        System.out.println("An instance of this class is created");
    }
    
    public static void main(String[] args) {
        info();
    }
    
    public static void info(){
        System.out.println("This class's full name is \"" + E.class + "\".");
    }
}
