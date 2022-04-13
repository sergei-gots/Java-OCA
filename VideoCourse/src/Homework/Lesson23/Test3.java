 
package Homework.Lesson23;

 
public class Test3 {
    public static void main(String[] args) {
        X3.test();
    }
}


class X3{
    public X3() {System.out.println('X');}
    public X3(int i) {System.out.println("X" + i);}
    private boolean abc() {return false;}
    
    public static void test() {
        X3 x = new Y3(18);
        System.out.println(x.abc()); //y.abc WON'T BE CALLED:
                                     //  while  X.abc is PRIVATE
                                     //  => Compile Time Binding
                                     //  calls X.abc
    }
}

class Y3 extends X3{
    public Y3(int i){System.out.println('Y');} //First, super will output 'X'
    public boolean abc(){return true;}
}


//ANSWER:           Y  X true
//CORRECT ANSWER:   X  Y false
//SCORE:            0/5
