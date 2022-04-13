 
package Lesson16;

 
public class Test11 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim(); //trim returns THE SAME STRING - from the
                                    //STRING POOL, because there is nothing to 
                                    //remove for method "trim" - there is no spaces
        System.out.println(x==y);
        
        x = "privet";
        y = " privet".trim();
        
        System.out.println(x==y);               //false
        System.out.println(x.equals(y));        //true
                
        
;    }
}
