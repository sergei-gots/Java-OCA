
package Homework.Lesson10.p4;

import Homework.Lesson10.p1.A;
import Homework.Lesson10.p1.p2.B;
import Homework.Lesson10.p1.p2.p3.C;
import Homework.Lesson10.p4.p5.*;

import static Homework.Lesson10.p1.p2.B.*;

 
public class D {
    public static void main(String[] args) {
        
        System.out.println("a=" + A.a);    
        A a = new A();
        System.out.println("a=" + a.value);
        
        //B = new B(); //constructor B is unknown because import is delared 
                        //as static.
        B.main(null);
        System.out.println("B.b=\"" + b + "\".");     
        System.out.println("A.b=\"" + A.b + "\".");  
        
        C.main(null);
        C.main(null);
        C.main(null);
        
        C c1 = new C();
        C c2  = new C();
        c1.info();
        c1.main(null);
        
        E.info();
        E e = new E();
    }
    
}
