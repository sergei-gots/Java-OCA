 
package Lesson16;

 
public class Test1 {
    public static void main(String[] args) {
        
        String s1 = new String("privet");
        
        int a = s1.length();
        System.out.println("length of s1:" + a);
        //System.out.println(s1.length());
        
        char c1 = s1.charAt(3);
        System.out.println(c1);
        
        // c1 = s1.charAt(10); //causes an Expection StringIndexOutOfBoundException
        
        int i1 =  s1.indexOf('t');
        System.out.println(i1);
        
        int i2 =  s1.indexOf("vet");
        System.out.println(i2);
        
        //If founded is not found - then index=-1
        int i3 =  s1.indexOf("z");
        System.out.println(i3);
        
        
        String s2 = new String("abcdefgabcd");
        
        int i4 = s2.indexOf('a', 5);
        System.out.println(i4);
        
        int i5 = s2.indexOf("ab", 5);
        System.out.println(i5);
        
        boolean b1 = s2.startsWith("abc");
        System.out.println(b1);
        
        boolean b2 = s2.startsWith("abC");
        System.out.println(b2);
        
        boolean b3 = s2.startsWith("abc", 7);
        System.out.println(b3);
        boolean b4 = s2.startsWith("abc", 6);
        System.out.println(b4);
        
        boolean b5 = s2.endsWith("abc");
        System.out.println(b5);
        boolean b6 = s2.endsWith("cd");
        System.out.println(b6);
        boolean b7 = s2.endsWith("d");
        System.out.println(b7);
        
        
        
;    }
}
