 
package Lesson9;
 

public class Car {

    String color;
    String engine;
    public static int count;
    public static int ab;
    
    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
        //And below there are example of a LOGIGAL mistake:
        //color = color;
        //engine = engine;

    }
    
    public void showColor(){
        System.out.println("Car color: " + color + ".");
    }

    public void changeColor(String color){
        int price = 5000;
        this.color = color;
        price+=1000;
        
        System.out.println("Car's color has been  changed");
    }
    
    void changeColor1(String color){
        System.out.println(color);
    }
         
    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        System.out.println(c.color);
        c.changeColor1("black");
        System.out.println(c.color);
        
    }
}

