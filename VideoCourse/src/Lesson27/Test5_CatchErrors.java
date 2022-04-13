 
package Lesson27;

 
public class Test5_CatchErrors {
    
    static void abc(){
        System.out.println("Method abc() is working");
        abc();
    }
    
    public static void main(String[] args) {
        try {
            abc();
        } catch(StackOverflowError e) {
            System.out.println("Error is caught.");
            System.out.println("e = " + e);
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("e.getLocalizedMessage() = " + e.getLocalizedMessage());
            System.out.println("e.printStackTrace:");
            e.printStackTrace();
        }
        
    }
}
