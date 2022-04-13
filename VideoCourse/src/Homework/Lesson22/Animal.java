 
package Homework.Lesson22;


public class Animal {
    private int eyes;
    
    public Animal(){
        System.out.println("I'am animal.");
    }
    
    public boolean setEyesCount(int eyes){
        if(eyes <0){
            return false;
        }
        this.eyes = eyes;
        return true;
    }
    
    public int getEyes(){
        return eyes;
    }
    
    
    public void eat(){
        System.out.println("The animal eats:)");
    }
    
    public void drink(){
        System.out.println("The animal drinks:)");
    }
}

