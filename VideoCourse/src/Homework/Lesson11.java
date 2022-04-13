 
package Homework;

 
public class Lesson11 {
    
}

class Car{
    String color;
    String engine;
    int doorCount;
    
    Car(String color, String engine, int doorCount){
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
    
    void info(){
        System.out.println("This car is " + color 
            + ", equipped with " + engine
            + "-engine and has " + doorCount + " doors.");
    }
}

class CarTest{

    static void changeDoorCount(Car c, int doorCount){
        c.doorCount = doorCount;
    }
    
    static void swapColors(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }
    
    public static void main(String[] args) {
        Car c1 = new Car("red", "V6", 3);
        Car c2 = new Car("blue", "V8", 5);
    
        c1.info();
        c2.info();
        
        changeDoorCount(c1, 5);
        changeDoorCount(c2, 7);
        swapColors(c1,c2);
        
        c1.info();
        c2.info();
    }
}