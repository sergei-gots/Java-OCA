package Lesson24;


public class Employees {
    public static void main(String[] args) {
        Help_able h = new Driver(); //IS-A relationship
        Swim_able s = new Driver(); //IS-A relationship
        Employee e = new Driver();  //IS-A relationship
        
        System.out.println("h.a = " + h.a);
        h.help();
        h.putOutTheFire("water");
        s.swim();
    }
}

class Employee extends java.lang.Object{
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    
    void eat(){
        System.out.println("Employee eats");
    }
    void sleep(){
        System.out.println("spit");
    }
}

class Driver extends Employee implements Help_able, Swim_able{
    String carBrand;
    void drive(){
        System.out.println("vodit");
    }
    public void help(){
            System.out.println("The driver is helping.");
    }
    public void putOutTheFire(String tool){
        System.out.println("The driver is puting the fire out with " 
                          +  tool + ".");
    }
    public void swim(){
        System.out.println("The driver can swim.");
    }
}

class Teacher extends Employee implements Help_able {
    int studentsCount;
    String salary = "150";
    void eat() {
        System.out.println("Teacher eats.");
    }
    @Override
    public void sleep() {
        System.out.println("Teacher sleeps.");
    }
    void teach(){ 
        System.out.println("uchit");
    }
    
    public void help(){
            System.out.println("The teacher is helping.");
    }
    public void putOutTheFire(String tool){
        System.out.println("The teacher is puting the fire out with " 
                          +  tool + ".");
    }
    
}

/* interface can has either public or default access modifier */

/* abstract */ interface Help_able{
    /* public abstract */ void help();
    /* public abstract */ void putOutTheFire(String tool);
    //Interface can have Constants
    /* public final static */ int a = 10; //CONSTANT
}

interface Swim_able{
    void swim();
}

abstract class Y implements Swim_able {}
abstract class X extends Y{}
abstract class Z extends Y{
    public void swim(){}
}