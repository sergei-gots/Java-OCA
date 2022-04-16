 
package Generics_31;

import java.util.ArrayList;
 
//GENERICS secure TYPE SAFE and provide REUSABLE CODE
//GENERICS can generate COMPILE but not RUNTIME errors

public class TestParameterizedClass {
    public static void main(String[] args) {
        //<> - called DIAMOND
        //withoud <Generics> it could be ROUGHT TYPE
        ArrayList <String> al = new ArrayList<> (); 
            
        Info <String, String> info1 = new Info<> ("Privet", null);
        System.out.println("info1 = " + info1);
        
        Info <Integer, String> info2 = new Info<> (100, "Ok");
        System.out.println("info2 = " + info2);
        
        String s = info1.getValue();
        int n = info2.getValue();
        Integer i1 = info2.getValue();
    }
    
    //FOR NEXT TWO METHODS ONLY ONE can exist
    //because of TYPE ERASURE after Compiling.
    //They will look like 
    //public void abc(Info info){...}
    public void abc(Info <String, String> info) {
        String s = info.getValue();
    }
    
    /*public void abc(Info <Integer, String> info) {
        Intger n = info.getValue();
    }*/
  
}


//PARAMETERIZED CLASS
//T means "TYPE PLACE HOLDER"
class Info <T, E> {
    private T value;
    private E value2;
    
    /* public Info(T value){
        this.value = value;
    }*/
    
    public Info(T value, E value2){
        this.value = value;
        this.value2 = value2;
    }
    public String toString(){
        return "[{" + value + "}]";
    }
    
    public T getValue(){
        return value;
    }
}


class Parent {
    public void abc(Info <String, String> info) {
    }
}


class Child extends Parent {
    //Such as overriding is not ok:
    //despite the TYPE ERASURE
    //by the casting in this subclass
    //there will be some problems
    /*
        public void abc(Info <Integer, String> info) {
        }
    */
}