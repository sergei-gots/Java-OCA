 
package Lesson26;

import java.util.ArrayList;
 
public class TestWrapperClasses {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5); //This is AUTOBOXING - automatic convertation of
                     //a primitive datatype to a corresponding ref-type.
        int a = list.get(0); //This is UNBOXING
        System.out.println("a = " + a);
        
        Long l = 50l;
        //Long l1 = 50; //doesn't work in such way: to Long can be converted
                      //only long, but not int.
                      
        Number b = new Integer(10); //UNBOXING here
        int c = (Integer)b; //UNBOXING here
        int c1 = (int)b;    //UNBOXING here
        switch((Integer)b){ //in switch could be used  byte, short, char, int
                    //such as Byte, Short, Char, Integer, String
            
        }
        
        String s1 = "50";
        //Either int or NumberFormatException
        int i1 = Integer.parseInt(s1);
        System.out.println("i1 = " + i1);
        
        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        Boolean b2 = Boolean.parseBoolean(s2);
        System.out.println("b1 = " + b1);
        
        String s3 = "3.14";
        double d = Double.parseDouble(s3);
        System.out.println("d = " + d);
        
        Integer i3 = Integer.valueOf(10);
        System.out.println("i3 = " + i3);
        
        Double d2 = Double.valueOf(s3);
        System.out.println("d2 = " + d2);
        
        //Byte b10 = new Byte(5); //NOT ALLOWED here is int as arg
        Byte b10 = new Byte((byte)5);
        Byte b11 = Byte.valueOf((byte)5);
        
        
                
    }
   
}
