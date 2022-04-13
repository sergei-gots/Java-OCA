 
package Lesson8;

 
public class Test1 {
   //The final variable can be initialised either by declaration,
    //or in each of constructor  
   public static final int a = 10; 
   //public  final int a; 
   //public final int a=10; 
   //also allowed but the usual order is "public final"
   //final public int a=20; 
   
   Test1(){
       //a=10;
   }
   
   Test1(boolean b){
       //a=5;
   }
   
   public void abc(final short s){
       //b is a local variable
       final byte b; // = 10;
       b = 10;
       System.out.println(s+b);
   }
   
    public static void main(String[] args) {
        Test1 t = new Test1();
        //final var cannot be modified.
        //t.a = t.a*2;
        System.out.println(t.a);
        System.out.println(a);
    }
}
