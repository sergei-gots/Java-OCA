 
package Lesson21;

public class Test {
    
    /*public Test(){
      //  this();  //recursive constructor invocation
      
    }*/
    
    /* Example of Conversion constructor into a method. */
    public Test(){
        System.out.println("A class Test-object is created");
    }
    
    //THIS is THE METHOD, NOT A CONSTRUCTOR
    public void Test(){
        System.out.println("This is the method Test.Test()");
    }
    
    //variable with a name equals the class name;
    Test Test;
    //AVOID THIS. It's an examples of stupid praxis
    
    /* OVERLOADING METHOD NEWANCES
     * 
     * 
     */
    public void abc(String s) {
        System.out.println(s);
    }
    
    public void abc(boolean b) {
        System.out.println(b);
    }

    public StringBuilder abc(StringBuilder sb) {
        System.out.println(sb);
        return new StringBuilder("poka");
    }    
    
    /* Within a method call, required a data type "int"
     * it's allowed to use data type "char"             */
    void abc(int i){
        System.out.println(i);
    }
    
    int abc(){
        return 5;
    }
    
    int abc2(int i){
        if(i>10){
            return 5;   /* return-statement is a last executed statement within method */
        }
        else {
            return 10;
        }
    }
    
    void abc3(){
        System.out.println("Hello");
        return;
        
        /* Below is UNREACHABLE STATEMENT: it follows after RETURN-statement */
        //System.out.println("Bye");
    }
    
    
    public void abc(int a, double b) {
        System.out.println("privet");
    }
    
    public void abc(double a, int b) {
        System.out.println("poka");
    }
    
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        testEmployee();
        
    }    
    
    static void testEmployee(){
        Employee e = null;
        e = new Employee();
        e = null;
    }
    
    static void test5(){
        int a = 7;
        
        /* Nested TERNARY operator */
        System.out.println(a>2 ? a<5 ? 3 : 6 : 9);
    }    
        
    static void test4(){
        Test t = new Test();
        
        /* the next causes compile time error
         * "Refernce to abc is AMBIGUOUS" */
        //t.abc(1,2);
        
        
        t.abc(1, 2d);
        t.abc(1, 2.0);
        t.abc(1, 2.0d);

        t.abc(1d, 2);
        t.abc(1.0, 2);
        t.abc(1.0d, 2);
    }
    
    static void test3(){
        Test t = new Test();
        t.Test();
        
        char c = 'a';
        System.out.println(c);
        
        /* char as int is allowed within call of method required
         * int as a parameter because char belongs to subset of int.    */
         t.abc(c);  
         
        /* Order number of 'b'=98.  
         * b here is accepted as int because the operator '+' after that. */
         System.out.println('b'+10);  
        
    }
    
    static void test1(){
        int a=4;
        System.out.println("(a<4)?7:privet : " + ((a<4)? 7: "privet"));
        //int b = (a<4)? 7 : "privet";
        
        int a1=5;
        int b1=5;
        int c1 = (a1>6)? a1++:b1++;
        System.out.println("a1=" + a1);
        System.out.println("b1=" + b1);
        
        /* It's not necessary that returned value is assigned to some variable */
        new Test().abc();
               
    }
    
    static void test2(){
        String s1, s2;
        s1=new String("privet");  //s1="privet"
        s2=new String("poka");    //s2="poka"  
        s1=s2;                    //"privet"->nowhere  
        String s3=s1;             //s1="poka" 
        s1=null;                  //s2="poka"  
    }                             //"poka"->nowhere  
}
 
class Employee {
    
    /* The next call of constructor causes StackOverflowError-EXCEPTION */
    Employee manager = new Employee();
    
    Employee(){
        System.out.println("Employee-constuctor is being executing");
    }
}