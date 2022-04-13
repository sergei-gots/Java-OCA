 
package Lesson30_LExps;

 
public class LambdaExp5 {
    static void def(LambdaExp5I2 lE5I){
            System.out.println(lE5I.abc("privet"));
    } 
    
    static void def2(LambdaExp5I2 lE5I2){
            System.out.println(lE5I2.abc("privet"));
    } 

    
    public static void main(String[] args) {
        def(x->x.length());
        def((x)->x.length());
        def((String x) -> x.length());
        def((String x) -> { return x.length(); });
        def((String x) -> { System.out.print("Two statements-Implementation: ");
                            return x.length(); });
        def((String x) -> { x = "ok";
                            return x.length(); });
        def(x -> { x = "yes";
                   return x.length(); });
        
    }
    
    
}


interface LambdaExp5I {
    int abc(String s);
}

interface LambdaExp5I2 {
    int abc(String s);
}