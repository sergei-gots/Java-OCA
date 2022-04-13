 
package somemethods;

 
public class StringMethods {
       public static void main(String[] args) {
           
           System.out.println("String.isBlank():");
           String s1 = "privet";
           System.out.println(s1.isBlank());
           String s2 = "      s       ";
           System.out.println(s2.isBlank());
           String s3 = "               ";
           System.out.println(s3.isBlank());
           
           
           System.out.println("\nString.isEmpty():");
           String s4 = "";
           System.out.println(s4.isEmpty());
           String s5 = " ";
           System.out.println(s5.isEmpty());
           //String s6 = null;
           //System.out.println(s6.isEmpty());
           
           //strip-Method also removes all the other possible space symbols
           //for example like a 'Tab'-s or NEW-LINE-s.
           System.out.println("\nString.strip():");
           String s10 =  "\n              privet   ";
           System.out.println('{' + s10 + '}');
           System.out.println('{' + s10.strip() + '}');
           System.out.println('{' +  s10.stripLeading() + '}');
           System.out.println('{' + s10.stripTrailing() + '}');
           
           System.out.println("\n");
           String s20 =  "poka";
           String s21 = s20.strip();
           System.out.println(s20==s21); //s20 is the same ref as s21 bcs ther      
                                         //was nothing to remove => result==TRUE
                                         
           String s22 =  new String("poka");
           String s23 = s22.strip();
           System.out.println(s22==s23); 
           
    }
}
