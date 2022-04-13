 
package Lesson16;

 
public class Test3 {
    public static void main(String[] args) {
        
        int a=5;
        int b=6;
        String s = "ok";
        System.out.println(a + b + s);          // 11ok
        System.out.println("" + a + b + s);     // 56ok
        System.out.println("" + (a + b) + s);   // 11 ok
        
        String s1 = "Hello";
        String s2 = "" + a+8;
        System.out.println(s2);
        
    }
}
