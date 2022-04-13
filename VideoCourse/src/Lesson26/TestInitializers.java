package Lesson26;

class SuperClass {
    SuperClass(){
        System.out.println("This is SuperClass-constructor.");
    }
}

public class TestInitializers extends SuperClass {
    String s1;
    
    //This is an INITIALIZER-BLOCK
    {
        s1 = "ok";
        System.out.println("Hello");
        int a = 5;
        System.out.println("a = " + a);
        System.out.println("s1 = " + s1);
        System.out.println("This is Initializer-block-1.");
        
    }
    
    static {
        System.out.println("This is STATIC Initializer-block-1.");
        
    }

    
    {
        System.out.println("This is Initializer-block-2.");
        
    }

    static {
        System.out.println("This is STATIC Initializer-block-2.\n");
        
    }
    
    TestInitializers(){
        this(50l);
        System.out.println("This is constructor.");
    }
    
    TestInitializers(int a){
       
        System.out.println("This is constructor (int a).");
        
    }
    
    TestInitializers(long a){
        System.out.println("This is constructor (long a).");
        
    }
    
    public static void main(String[] args) {
        TestInitializers test1 = new TestInitializers();
        System.out.println();
        TestInitializers test2 = new TestInitializers(2);
        System.out.println();
        TestInitializers test3 = new TestInitializers(3l);
        System.out.println();
    }
}

