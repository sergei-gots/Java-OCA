 
package Lesson24;
 
public class Java8Interfaces {
    
}

//Default-methods (can't be static, final or abstract).
interface I1{
    /*public*/void abc();
    /*public*/default void ghi() { System.out.println("This is the method \"ghi\".");}
    /*public*/default void def() { System.out.println("This is the method \"def\".");}
    
    default void jkl(){ System.out.println("This is the method \"jkl\".");}
    
    static void mno(){ System.out.println("This is the STATIC method \"mno\".");}
}

interface I3 {
    static void mno(){ System.out.println("This is the STATIC method \"I3.2mno\".");}
}

interface I2 extends I1 {
    /* here default method is overrided as abstract one. */
    void abc();
}

abstract class R implements I1{
    abstract public void abc();
}

abstract class O {
}

class Z2 extends O implements I1, I3{
     public void abc() { System.out.println("This is the method \"abc\".");}
     public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
        z.ghi();
        //Calling a static method - only with the name of an origin interface
        I1.mno();
        I3.mno();
        I2 i = new D2();
        z.method1(i);
    }
    
    public void ghi() { System.out.println("This is the method \"Z2.ghi\".");} 
    
    
    I1 method1(I2 i) { return new Z2();}
}

class D2 implements I2{
    public void abc(){}
}