package Lesson26;


public class TestOverloadingPriority {
   void abc(int i){System.out.println("int");}
   void abc(byte i){System.out.println("byte");}
   void abc(long i){System.out.println("long");}
   
   void def(Object o){System.out.println("Object");}
   void def(String o){System.out.println("String");}

   //Methods PRIORITY
   // 1. FULL MATCH 
   // 2. More CAPABLE Data Types
   // 3. AUTOBOXING
   // 4. VarArgs
   // This order supports back compability of Java Versions.
   void ghi(int a, int b){System.out.println("Hello - 1");}
   void ghi(long a, long b){System.out.println("Hello - 2");}
   void ghi(Integer a, Integer b){System.out.println("Hello - 3");}
   void ghi(int ... a){System.out.println("hello - 4");}
   
   public static void main(String[] args) {
        TestOverloadingPriority test = new TestOverloadingPriority();
        test.abc(5);
        test.def("hello");
        test.def(new StringBuilder("hello"));
        test.ghi(1,2);
   }
}
