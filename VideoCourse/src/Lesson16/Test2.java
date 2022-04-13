 
package Lesson16;

 
public class Test2 {
    public static void main(String[] args) {
        
        String s1 = new String("abcdefgabcd");
        
        String s10 = s1.substring(3);
        System.out.println(s10);
        //String objects are inmutable
        System.out.println(s1);
        
        String s11 = s1.substring(3,7); //FRROM 3d to 6th!!! (n-1) 
        System.out.println(s11);
        
        String s12 = s1.trim();
        System.out.println(s12);
        
        String s2 = "     abcdef   gabcd   ";
        String s13 = s2.trim();
        System.out.println(s13);
        
        String s1310 = s1.substring(3,10);
        System.out.println(s1310);
        
        String s1311 = s1.substring(3,11);
        System.out.println(s1311);
        
        /*
        String s1312 = s1.substring(3,12); //causes StringIOBEx (because length =11
        System.out.println(s1312);
        */
        
        String s4 = "privet";
        String s14 = s4.replace('t', 'z');
        System.out.println(s14);
        
        String s15 = s4.replace("vet", "vivka");
        System.out.println(s15);
        
        //!!!!!!
        String s41 = "poka";
        String s42 = s41.replace("k", "k");
        System.out.println(s41==s42); //TRUE!
        
        String s5 = "Privet,";
        String s51 = "drug";
        System.out.println(s5.concat(s51));
        System.out.println(s5+s51);
        
;    }
}
