package Lesson26;


public class TestOverloadingPriority1 {
   void abc(String s){System.out.println("A");}
   void abc(String ... s){System.out.println("B");}
   void abc(Object c){System.out.println("C");}
   void abc(String s1, String s2){System.out.println("D");}
   
   void def(Long a) {System.out.println("E");}
   void def(Long ... a) {System.out.println("F");}
 //  void def(long a) {System.out.println("G");}
   void def(Object a) {System.out.println("H");}
  // void def(Integer a) {System.out.println("I");}
   
   public static void main(String[] args) {
        TestOverloadingPriority1 test = new TestOverloadingPriority1();
        test.abc("ok");
        test.abc("ok", "!!!");
        test.abc("ok", "!!!", ")))");
        
        test.def(50l);
        test.def(50l, 60l);
        test.def(50); //Can be converted to long
                      //also - to Integer and this is instanceof Object
                      
   }            
}
