 
package Lesson26;

 
public class Test6 {
    int a = 3;
    Test6(){
        a=4;
    }
    
    {
        a=5;
    }
    
    public static void main(String[] args) {
        Test6 test = new Test6();
        System.out.println("test.a = " + test.a);
    }
}

class A {
    static final int a = 9;
    static final int b;
    int c = 11;
    static int d;
    static {
        b=10;
        d++;
    }
    
    A(){}
}


class B{
    static int c;
    static final int d;
    static final int e=1;
    static final int f;
    static {
        c=5;
        d=3;
//        d=5;   //NOT ALLOWED - is already initialised 
        //e=2; //NOT ALLOWED - It's initialised with the declaration
        f=0;
        
    }
}

class C{
    String s = "ok";
    {
        System.out.println("s = " + s);
    }
        
    static int i=0;
    
    static {
            System.out.println("i = " + i);
    }
    
    {
            i=i+1;
            System.out.println("i = " + i);
    }
    C(){
        System.out.println("This is constructor.");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello everyone!");
        C c = new C();
    }
        
}

class D{
    static{abc(2);}
    static void abc(int a) { System.out.println("a = " + a) ;}
    D(){abc(5);}
    static{abc(4);}
    {abc(6);}
    static{new D();}
    {abc(8);}
    public static void main(String[] args) {
        
    }
}
