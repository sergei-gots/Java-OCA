 
package Lesson17;

 
public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1:" + sb1);
        System.out.println("sb2:" + sb2);
        
        
        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb4 = new StringBuilder("123");
        StringBuilder sb5 = sb4;
        StringBuilder sb6 = sb4.append("4");
        
        System.out.println(sb4.equals(sb3)); //false
        System.out.println(sb4.equals(sb5)); //true
        System.out.println(sb4.equals(sb6)); //true
        
    }
}
