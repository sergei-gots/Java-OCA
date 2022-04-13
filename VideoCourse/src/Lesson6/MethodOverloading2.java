
package Lesson6;


public class MethodOverloading2 {
    
    public int sum(int i1, int i2){
        return i1+i2;
    }
    
    protected String sum(String s1, String s2){
        return s1+" "+s2;
    }

    //Compiler checks SYNTAXIS and SEMANTICS (Sense of words sequences);
    //protected void sum(int a, int b){

    
    //COMPILER DOESN'T ALLOW to create overloaded methods 
    //with the SAME NAME and SAME SET of XXX.
    //This is called "COMPILER's ERROR. 
    
    
    //    System.out.println("PRIVET!!!")
    //}
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        
        int a = mO2.sum(5, 7);
        System.out.println(a);
        String s = mO2.sum("Hello", "my friend!");
        System.out.println(s);
    }
}
