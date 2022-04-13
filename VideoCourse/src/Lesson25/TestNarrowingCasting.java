 
package Lesson25;
 
public class TestNarrowingCasting {
    //for testVarDeclaration:
    int a, b=3, c, d=b+5;
    int a2, b2=3, c2, d2=a2+5;
    //int a3, b3=3, c3=10-d3, d3=7; //not allowed
    int a3, b3=3, d3=7, c3=10-d3; //allowed
    
    float  f    =3.14f;
    float  f2   = (float)3.14;
    double d314 = 3.14;
    
    public static void main(String[] args) {
        //testCasting();
        //testNumericPromotion();
        
        TestNarrowingCasting testNC = new TestNarrowingCasting();
        testNC.testVarDeclaration();
        
    }   
    
    void testVarDeclaration(){
        
        System.out.println("a2 = " + a2);
        System.out.println("d2 = " + d2);
    }
    
    //NUMERIC PROMOTION 
    static void testNumericPromotion(){
        int i = 5;
        long l = 10;
        i = (int)(i*l);
        i*= l; //i converts into long and multiplyes. 
                //then the product will narrowly casted into int 
                //and assigned to i.
        System.out.println("i+l = " + i+l);
        
        float f = 3.14f;
        int i2 = 10;
        System.out.println("f+i 2 = " + (f+i2));
        
        //byte, short and char in ariphmetic operation  will be
        //converted to int even if threre isn't any actor of int-datatype
        //in this operation.
        //Exception - unary operators.
        byte b=3;
        short s=4;
        char c=5;
        System.out.println("b+s+c = " + (b+s+c));
        System.out.println("b++ = " + b++);
        
        byte b2=10;
        float f2=7;
        double d2=2.0;
        // b2 will converts to int
        // b2 will converts to float
        // (b2+f2) will converts to double
        // result will be double.
        System.out.println("(b2+f2-d2) = " + (b2+f2-d2));
        //int i5 = b2+f2-d2; //not allowed
        //long l5 = b2+f2-d2; //not allowed
        double d5 = b2+f2-d2; //allowed
        
        double d10=3.14;
        float f10=6.28f;
        
        float f11=0*1.5f;
        float f12=0*(float)1.5;
    }
    
    static void testCasting() {
        byte b = 10;
        int a = b;
        int i1 = 3;
        
        short s2 = (short)i1;
        byte b2 = 127;
        short s1 = 100;
        long l1 = 1;
        int i2 = (int)l1;
        
        
        int i10=10000;
        short s10= (short)i10;
        System.out.println("s10 = " + s10);
        char c10 = (char)-8;
        System.out.println("c10 = " + c10);
        boolean b10=true;
        //boolean cannot converted to int
        //int i11 = (int)b10;
        int i12 = (int)3.14;
        System.out.println("i12 = " + i12);
        double d = 58974568.563;
        byte b12 = (byte)d;
        System.out.println("b12 = " + b12);
        
        int i = 2147483647; //int max.
        System.out.println("i+1 = " + (i+1) + ". It is actually min(int).");
        System.out.println("i+2 = " + (i+2) + ". min(int)+1.");
        
    }
   
}
