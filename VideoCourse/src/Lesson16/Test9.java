 
package Lesson16;

 
public class Test9 {
    public static void main(String[] args) {
        
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1==s2);          // false : s1 and s2 are differrent objects
        System.out.println(s1.equals(s2));   // true : s1 contains the same array of symbols
                                             //     as s2.
        String s3 = "privet";
        String s4 = "privet";
        System.out.println(s3==s4);         //s3 is is in Strin Constant POOL
        System.out.println(s3.equals(s4));
        
        System.out.println(s1!=s4);         //false
        
        String s10 = "Kak Dela?";
        String s11 = "Kak dela?";
        System.out.println(s10.equals(s11));            //false
        System.out.println(s10.equalsIgnoreCase(s11));  //true
        
        
    }
}
