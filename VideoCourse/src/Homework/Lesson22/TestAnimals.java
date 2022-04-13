 
package Homework.Lesson22;

 
public class TestAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getPaws();
        System.out.println("The dog has a " + dog.getPaws()
                          + " paws.");
        System.out.println();
        
        Cat cat = new Cat();
        cat.sleep();
    }
}
