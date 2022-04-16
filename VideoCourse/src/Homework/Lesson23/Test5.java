 
package Homework.Lesson23;

 
class X1{
    String s1 = "privet";
}

class Y2 extends X1{
    boolean bool = false;
}

public class Test5 {
    
    public static void main(String[] args) {
        X1 x = new Y2();
        //System.out.println(x.s1 + " " + x.bool);
    }
    
}


//ANSWER:           COMPILE TIME ERROR .bool is not a field of class X.
//CORRECT ANSWER:   CANNOT FIND SY2MBOL.Symbol: variable bool
//SCORE:            1/5