package Homework.Lesson24;


abstract public class Animal {
    String name;
    
    Animal(String name){
        this.name = name;
    }
    
    abstract void eat();
    abstract void sleep();
    
    public static void main(String[] args) {
        lesson24();
        lesson25();
    }
    
    static void lesson25() {
        
        Animal a;
        Fish f;
        SwordtailFish stf = new SwordtailFish("Reddy");
        Bird b; 
        Penguin p = new Penguin("spooky");
        Mammal m;
        Lion l = new Lion("Leo");
        Speakable sf;
        
        a = f = stf;
        sf=b=p;
        m=l;
        
        Object[] arrayVars = { a, f, stf, b, p, m, l, sf };
        final int nVars = arrayVars.length;
        Speakable[] arraySpeakable = { null, null, null, null, null, null, null, null } ;
        Animal [] arrayAnimal = { null, null, null, null, null, null, null, null } ;
        
        for(int i=0; i<arrayVars.length; i++) {
            Object object = arrayVars[i];
            if(object instanceof Animal){
                arrayAnimal[i]=(Animal)object;
            }
            if(object instanceof Speakable){
                arraySpeakable[i]=(Speakable)object;
            }
        }
        
        System.out.println("Speakable: ");
        for(Speakable speakable:arraySpeakable){
            if(speakable != null) { 
                System.out.print("speakable.speak = ");
                speakable.speak();
            }
        }
        for(Animal animal:arrayAnimal){
            if(animal != null) { 
                System.out.println("animal.name = " + animal.name);
                System.out.print("animal.eat = ");
                animal.eat();
                System.out.print("animal.sleep = ");
                animal.eat();
            }
            
        }
        
        System.out.println("***********************************************\n");
    }
    static void lesson24() {
        SwordtailFish fish = new SwordtailFish("Reddy");
        System.out.println("fish.name = " + fish.name);
        fish.swim();
        fish.eat();
        fish.sleep();
        System.out.println();
        
        Speakable speakable = new Penguin("Pi");
        speakable.speak();
        System.out.println();
        
        Animal animal = new Lion("Pussy");
        System.out.println("animal.name = " + animal.name);
        animal.eat();
        animal.sleep();
        System.out.println();
        
        Mammal mammal = new Lion("Cat");
        System.out.println("mammal.name = " + mammal.name);
        mammal.speak();
        mammal.eat();
        mammal.run();
        mammal.sleep();
        
        System.out.println("***********************************************\n");
        
    }
    
}


abstract class Fish extends Animal {
    
    Fish(String name){
        super(name);
    }
    
    abstract void swim();
    
    public void sleep(){
        System.out.println("It's always interesting to watch how fish are sleeping");
    }
}

class SwordtailFish extends Fish{
    
    SwordtailFish(String name){
        super(name);
    }
    
    public void swim(){
        System.out.println("A swordtailfish \"Xiphophorus helleri\" is a gorgeous fish which swims fast! ");
    }
    
    public void eat(){
        System.out.println("A swordtailfish \"Xiphophorus helleri\" is not a predator. It eats casual fish food!");
    }
}

abstract class Bird extends Animal implements Speakable{
    
    Bird(String name){
        super(name);
    }
    
    abstract public void fly();
    
    public void speak(){
        System.out.println("The Bird " + name + " is singing.");
    }
}

class Penguin extends Bird{
    
    Penguin(String name){
        super(name);
    }
    
    public void eat(){ 
        System.out.println("Penguins love to eat fish!");
    }
    
    public void sleep(){
        System.out.println("Penguins sleeps cuddling each over!");
    }
    
    public void fly(){
        System.out.println("Penguins can't fly!");
    }
    
    public void speak(){
        System.out.println("Penguins can't sign like nightingales");
    }
}

abstract class Mammal extends Animal implements Speakable{
    
    Mammal(String name){
        super(name);
    }
    
    abstract void run();
}

class Lion extends Mammal{
    
    Lion(String name){
        super(name);
    }
    public void speak() { System.out.println("Lion is growling.");} 
    public void eat(){     System.out.println("Lion like any predator likes meat.");}
    public void sleep(){   System.out.println("The lion's share of the day a lion is sleeping");}
    public void run(){     System.out.println("Lion is not the fastest cat!");}

}

interface Speakable {
    default void speak(){
        System.out.println("Somebody is speaking.");
    }
}

