 
package Homework.Lesson10.p1.p2;

 
public class B {
    
    public static int b='b';
    public int value; 
    
    public static void  info(){
        System.out.println("Full class name:\"" + B.class 
                    + "\"; class has static int variable b=" + b + ".");
    }
    
    public static void main(String[] args) {
        System.out.println("main-method of the class B is being called.");
        info();
    }
}
