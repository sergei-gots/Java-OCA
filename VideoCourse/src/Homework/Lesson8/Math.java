 
package Homework.Lesson8;
 

public class Math {
    
    static final double Pi = 3.14;
    
    static int mult(int a, int b, int c) {
        return a*b*c;
        
    }
    
    static void divideAndShow(int a, int b) {
        int result = a/b;
        int remainder = a%b;
        System.out.println("Division " + a + "/"  +b
                + ". Result=" + result
                + "; Reminder=" + remainder +".");
        
    }
}


class Lesson8_1Test {
    public static void main(String[] args) {
        
        System.out.println(Math.mult(3,5,7));
        System.out.println(Math.mult(1,2,3));
        Math.divideAndShow(37,12);
        Math.divideAndShow(342, 49);
        
    }
}