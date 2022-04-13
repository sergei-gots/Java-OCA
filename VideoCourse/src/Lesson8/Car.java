 
package Lesson8;

 
public class Car {
   String color = "blue";
   String engine = "V6";
}


class Human{
    String name = "Ivan";
    final Car c = new Car();
    public static void main(String[] args) {
        Human h1 = new Human();
        //for final Car c the next rows are not allowed
        //h1.c = new Car();
        //h1.c = new Car();
        h1.c.engine = "V8";
    }
}
