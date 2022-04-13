package Homework.Lesson23;

import Homework.Lesson23.p1.X;


public class Test1 {
    public static void main(String[] args) {
        
        class Y extends X {
            Y(){}
            
            public void abc() { System.out.println('Y');}
        }
        
        Y y = new Y();
        y.abc();
        
    }
         
}

//ANSWER - 'Y"
//CORRECT ANSWER 
//   - RuntimeEX - Uncompilable code - X() is not public in Homework.Lesson.p2.X 


//SCORE: 0 from 5