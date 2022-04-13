
package Lesson3;

public class Test9 {

    public static void main(String[] args){
    
           char c = 'a';
           int i = 10;
           int i2 = c;
           
           // short s=c; //char{0;65535} but short{-32768;32767}
           System.out.println(i%c);
           
           
           boolean b1 = false;
           
           boolean b2 = b1==true;
           System.out.println(b2);
           
           b2 = b1=true;
           System.out.println(b2);

    }
}
