 
package Generics_31;

import java.util.ArrayList;
 
//BACKWARD COMPATIBILITY

public class TestTypeErasure {
    public static void main(String[] args) {
        //Info about generics known oly for COMPILER
        ArrayList <Integer> al1 = new ArrayList<> ();
        int i1 = al1.get(0);

        //For JVM it will be ROUGH TYPE:
        ArrayList al = new ArrayList<> ();
        int i2 = (Integer)al.get(0);
    }
    
}


