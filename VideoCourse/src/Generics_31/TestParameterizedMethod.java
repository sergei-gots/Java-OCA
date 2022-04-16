 
package Generics_31;

import java.util.ArrayList;
 
public class TestParameterizedMethod {
    public static void main(String[] args) {
        ArrayList <Integer> al1 = new ArrayList<> ();
        ArrayList <String> al2 = new ArrayList<> ();
        
        al1.add(10);
        al1.add(30);
        al1.add(150);
        int a = ContainsGenericMethod.getSecondElement(al1);
        System.out.println("a = " + a);
        
        al2.add("a");
        al2.add("b");
        al2.add("c");
        String s = ContainsGenericMethod.getSecondElement(al2);
        System.out.println("s = " + s);
    }
    
}


//PARAMETERIZED CLASS
//T means "TYPE PLACE HOLDER"
class ContainsGenericMethod {
    //<T> here is the pointer that GENERIC will be used as a return type
    public static <T> T getSecondElement(ArrayList <T> al){
        return al.get(1);
    }
}
