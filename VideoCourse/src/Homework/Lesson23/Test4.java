 
package Homework.Lesson23;

 
class X{}

class Y1 extends X{}

public class Test4 {
    public static void abc(X x, Y1 y) {
        System.out.println("privet");
    }
    public static void abc(Y1 y, X x) {
        System.out.println("poka");
    }
    public static void main(String[] args) {
        Y1 a = new Y1();
       //  abc(a,a);
    }
    
}


//ANSWER:           poka
//CORRECT ANSWER:   RuntimeEX - Uncompilable code 
//                      - reference to abc is AMBIGUOUS.
//SCORE:            0/5