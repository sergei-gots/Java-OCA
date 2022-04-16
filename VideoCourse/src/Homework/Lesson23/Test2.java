package Homework.Lesson23;

import Homework.Lesson23.p1.*;


class Y extends X1 {
        public void abc(){System.out.println('Y');}
        public void def(){Y y =new Y(); y.abc();}
        //public void ghi(){X1 x =new Y(); x.abc();} //abc is protected! 
                                                    //compile error
}
        
public class Test2 {
    
    public static void main(String[] args) {
            Y a = new Y();  
            a.abc();
            a.def(); 
           // a.ghi();
    }
}

//ANSWER - 'Y Y Y'
//CORRECT ANSWER 
//   - Compile Time Error - X.abc is protected!

//SCORE: 0 from 5