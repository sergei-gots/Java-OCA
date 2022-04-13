package Homework.Lesson22;

public class Cat extends Pet {
    
    public Cat(){
        present();
    }
    
    public Cat(String name){
        super(name);
        present();
    }
    
    public void present(){
        System.out.println("I am cat and my name is " + name + ":)");
    }
    
    
    public void sleep(){
        System.out.println("The cat sleeps:)");
    }
}