package Homework.Lesson22;

public class Pet extends Animal {
    StringBuilder name;
    protected final int tails = 1;
    protected final int paws = 4;
    
    public Pet(){
        init();
    }
    
    public Pet(String name){
        setName(name);
        init();
    }
    
    public void setName(String name){
        this.name = new StringBuilder(name);
    }
    
    public StringBuilder getName(){
        return new StringBuilder(name);
    }
    
    public int getTails(){
        return tails;
    }
    
    public int getPaws(){
        return paws;
    }
    
    private void init(){
        setEyesCount(2);
        System.out.println("I'am pet.");
    }
    
    public void run(){
        System.out.println("The pet runs:)");
    }
    
    public void jump(){
        System.out.println("The pet jumps:)");
    }
    
    
}