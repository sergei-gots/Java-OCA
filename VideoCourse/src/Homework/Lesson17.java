 
package Homework;
 
public class Lesson17 {
    static boolean Equality(StringBuilder sb1, StringBuilder sb2){
            if (sb1==null || sb2==null){
                return false;
            }
            String s1 = new String(sb1);
            String s2 = new String(sb2);
        return s1.equals(s2);
    }
    
    public static void main(String[] args) {
        StringBuilder sb0 = null;
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        StringBuilder sb3 = new StringBuilder("abcd");
        
        
        System.out.println(Equality(sb0, sb0));
        System.out.println(Equality(sb0, sb1));
        System.out.println(Equality(sb1, sb0));
        System.out.println(Equality(sb1, sb2)); //it is the only true case
        System.out.println(Equality(sb1, sb3));
        System.out.println(Equality(new StringBuilder(), new StringBuilder()) );
        
    }
}
