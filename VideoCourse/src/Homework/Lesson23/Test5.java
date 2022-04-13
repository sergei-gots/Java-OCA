 
package Homework.Lesson23;

 
class X{
    String s1 = "privet";
}

class Y extends X{
    boolean bool = false;
}

public class Test5 {
    
    public static void main(String[] args) {
        X x = new Y();
        //System.out.println(x.s1 + " " + x.bool);
    }
    
}


//ANSWER:           COMPILE TIME ERROR .bool is not a field of class X.
//CORRECT ANSWER:   CANNOT FIND SYMBOL.Symbol: variable bool
//SCORE:            1/5