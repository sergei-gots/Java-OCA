 
package Lesson30_LExps;

import java.util.ArrayList;

 
public class TestLocalVarTypeInference {
    /* INFERENCE is a guess that you make or an opinion 
        that you form based on the information 
        that you have
    */    
    public static void main(String[] args) {
        TestLocalVarTypeInference tlvti = new TestLocalVarTypeInference();
        var tlvti1 = new TestLocalVarTypeInference();
        var i = 10;
        var w = 1.5f;
        var array = new String [] { "a", "b" };
        var result = abc();
        Object obj1 = "privet";
        var obj2 = obj1;
        ArrayList <String> al = new ArrayList<>();
        for(var s:al) {
            System.out.println(s);
        }
        
        //var n = null; //not allowed
        //var [] array3 = new int {1,2}; //not allowed
        var array3 = new int []{1,2};
        var var = "var";
    }
    
    //var v = 10; //not allowed here
    
    static double abc() {
        return 3.14;
    }
    
    
}


interface I {
    void abc();
    
    default void def() { System.out.println("def");}
    default void def2() {}
    static void def3() {}
    
}



