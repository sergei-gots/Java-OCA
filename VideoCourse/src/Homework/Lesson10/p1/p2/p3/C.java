 
package Homework.Lesson10.p1.p2.p3;

 
public class C {
    public static char c='b';
    static int count;
    char chValue; 
    
    
    public C(){
        chValue = ++c;
        System.out.println("The " + count 
                + ". instance of the class C is created");
        info();
    }
    
    public void info(){
            System.out.println("chValue=\"" + chValue + "\"."); 
    }
    
    public static void main(String[] args) {
        System.out.println("Hi there from the main-method of the class \"" 
                + C.class + "\"!");
        System.out.println("Hier is the static variable \"c\" is incremented.");
        System.out.println("And its value is already \"" + ++c + "\".");
    }
}
