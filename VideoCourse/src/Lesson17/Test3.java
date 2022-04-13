 
package Lesson17;

 
public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1.append("Good bye!");
        
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        
    }
}
