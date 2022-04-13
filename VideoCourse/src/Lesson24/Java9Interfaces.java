 
package Lesson24;

 
public class Java9Interfaces {
    
}

/* PRIVATE Access Modifiers */
interface I1{
    private static void method1(){
        System.out.println("Static method.");
    }
    
    private void method2(){
        System.out.println("Non-static method.");
    }
    
    default void method3(){
        method1();
        method2();
    }
    
    static void method4(){
        method1();
    }
}