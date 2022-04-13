
package Lesson5;


public class Human {
    String name;
    Car3 car;
    BankAccount bA;
    
    void info(){
        System.out.println("Name: " + name
                + "; Car color: " + car.color 
                + "; Bank account: " + bA.balance + ".");
    }
    
}


class HumanTest{

    public static void main(String[] args){
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "V6");
        h.bA = new BankAccount(18, 200.50);
        
        h.info();
    }
}

class Car3{
    
    Car3(String c, String e){
        color = c;
        engine = e;
    }
    
    String color;
    String engine;
}


class BankAccount{
    
    BankAccount(int id_, double balance_){
        id = id_;
        balance = balance_;
    }
    
    int id;
    double balance;
}