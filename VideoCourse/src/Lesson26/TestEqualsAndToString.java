 
package Lesson26;

import java.util.ArrayList;

public class TestEqualsAndToString {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        System.out.println("(c1==c2) = " + (c1==c2));
        System.out.println("(c1.equals(c2)) = " + (c1.equals(c2)));
        System.out.println("(c1.equals(c3)) = " + (c1.equals(c3)));
        
        Object o = new Car("red", "V4");
        System.out.println("(o.equals(c2)) = " + (o.equals(c2)));
        
        ArrayList <Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("black", "V8");
        
        System.out.println("list.contains(c4) = " + list.contains(c4));
        System.out.println("c1.equals(null) = " + c1.equals(null));
        
        //default toString() returns ClassName and HASHCODE
        System.out.println("c3 = " + c3);
        System.out.println("list = " + list);
        
    }
}


class Car{
    String color;
    String engine;
    
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
        }
    
    /** Overrided method EQUALS SHOULD HAVE:
     *  Symmetry
     *  Reflexivity
     *  Transitivity
     *  Constancy
     *  to return    false for  NULL as compared object. 
     */
    
    //public boolean equals(Car obj){    //This is NOT OVERRIDING
    public boolean equals(Object obj){   //This is OVERRIDING
        //return(this==obj); //this is how this method is in the Object-class
        if(obj instanceof Car){
            Car c2 = (Car)obj;
            return (color.equals(c2.color) 
                    && engine.equals(c2.engine));
        }
        else {
            return false;
        }
    }
    
    public String toString(){
        return "A car of color \"" + color + "\" with a motor type \""
                + engine + "\"";
                
                
    }
}
