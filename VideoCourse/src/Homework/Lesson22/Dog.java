package Homework.Lesson22;

public class Dog extends Pet {
    
    public Dog(){
        present();
    }
    
    public Dog(String name){
        super(name);
        present();
    }
    
    public void present(){
        System.out.println("I am dog and my name is " + name + ":)");
    }
    
    public void play(){
        System.out.println("The dog plays:)");
    }
}