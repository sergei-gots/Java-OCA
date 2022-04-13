 
package Lesson18;

 
public class Test8 {
    public static void main(String[] args) {
        char[] array = { 'p','r','i','v','e','t'};
        String s = new String(array);
        System.out.println(s);
        
        StringBuilder sb = new StringBuilder("Hello World");
        //APPEND(ARRAY, StartPosition, HowMuch)
        sb.append(array, 2, 3);
        System.out.println(sb);
        
        StringBuilder sb1 = new StringBuilder("Hello World");
        //INSERT into POSITION  from ARRAY from the STARTPosition N Symbols
        sb1.insert(2, array, 1, 3);
        System.out.println(sb1);
        
    }
}
