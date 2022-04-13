 
package Lesson12;

 
public class Car {
    int engine;
    int doorCount;
    
    Car(int engine, int doorCount){
        this.engine = engine;
        this.doorCount = doorCount;
    }
}


class CarTest{
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);
        
        if(c1.engine>c2.engine)
        if(c1.doorCount>c2.doorCount) {
                System.out.println(
                        "Engine power and door count in the car1 is more.");
        }
        else {
                System.out.println("Engine power of the car1 is more, and doors count  is less");
        }
        else {
            System.out.println("Engine power of the car1 is less than of the car2");
        }
    }
}