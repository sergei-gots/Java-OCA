
package Lesson4;


public class Car {
 // DEFAULT CONSTRUCTOR - created by compitler. Always w/o xxx    
    //does not exist if a user defined constructor is defined.
    //in the pure default constructor the body is empty
    //Here is USER DEFINED CONSTRUCTOR which is identical by declaration to 
    //the default constructor
    Car() { 
        color = "blue";
        engine = "V12";
        System.out.println("Object is created");
    }  
    
 // USER DEFINED CONSTRUCTOR
    //void modifier transforms the constructor into a method
    //void Car(String color_, String motor_ ){
  Car(String color_, String motor_ ){
 
        color = color_;
        engine = motor_;
        
        System.out.println("Car color: " + color + "; Car engine: " + engine);
        
    }
    
    String color;
    String engine;
}


class CarTest{
    public static void main(String[] args){
        int a;
        Car car1 = new Car();
        //car1 contains the adress of the created object
        Car car2 = new Car("yellow", "V4");
        Car car4; //This Var is not refering to any object.
                    //It's like a leash for a dog without dog in it.
                    
        //One more new object with its address in memory
        
        //Several REF.VARS can refer to the same instance:
        //A new object won't be created. But there is a new var, which 
        //refer to the car1 object.
        //But it is impossible to refer to two or more incstances
        //simultaniously.
        Car car3 = car1;
        
        car1.color="black";
        car1.engine="V8";
        
        //We are creating an instance without reference for it/
        //It's like a dog without a leash on it.
        System.out.println(new Car().color);
        
        System.out.print("Color:");
        System.out.println(car1.color);
        System.out.print("Engine:");
        System.out.println(car1.engine);
        
        //And the same information can be output as CONCANTENATED STRING:
        // + is a CONCATENATING OPERATOR for String instances
        System.out.println("Color: " + car1.color);
        System.out.println("Engine: " + car1.engine);
        
        
        car2.color = "red";
        car2.engine = "V5";
        System.out.println("Car2:");
        System.out.println("\t" + car2.color);
        System.out.println("\t" + car2.engine);
        
    }
    
}