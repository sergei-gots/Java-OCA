 
package Lesson25;
 
//Up-Casting - casting from a subclass to a superclass - automatically
//Down-Casting - castin from a superclass to a subclass - manually
//              might cause ClassCastException 
// Casting marks ref-variable so as if it was a variable of another class.

public class Casting {
    public static void main(String[] args) {
        Employee emp = new Doctor(); //Up-Casting here.
        ((Doctor)emp).help();        //Down-Casting here.
        
        
        
        Employee emp1 = new Doctor();  //Up-Casting here (automatically)
        Employee emp2 = new Teacher(); //Up-Casting here
        Employee emp3 = new Driver();  //Up-Cacting here
        Employee emp4 = new Employee();
        Doctor d1 = (Doctor)emp1;
        System.out.println("d1.specialisation = " + d1.specialisation);
        
        //(Down-)Casting:
        System.out.println("((Doctor)emp1).specialisation = " + ((Doctor)emp1).specialisation);
        d1.lechit();
        //(Down-)Casting:
        ((Doctor)emp1).lechit();
        
        //Next causes ClassCastEX:
        //System.out.println("((Doctor)emp2).specialisation = " + ((Doctor)emp2).specialisation);
        
        System.out.println();
        
        Help_able h = new Doctor();
        h.help();
        System.out.println("((Doctor)h).specialisation = " + ((Doctor)h).specialisation);
        ((Doctor)h).lechit();
        
        Employee emp10 = new Employee();
        Casting c = new Casting();
        System.out.println("emp10==emp:" + (emp10==emp));
        System.out.println("emp10==d1:" + (emp10==d1));
        
        Employee [] array = { emp1, emp2, emp3, emp4 };
        for(Employee e:array){
            //The instanceof-operator here protects from ClassCastException.
            if(e instanceof Driver){
                System.out.println("((Driver)e).carBrand = " + ((Driver)e).carBrand);
                ((Driver)e).drive();
            }
        }
        
        
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

class Doctor extends Employee implements Help_able{
    String specialisation = "surgeon";
    
    void lechit(){
        System.out.println("lechit");
    }
    
    public void help() {System.out.println("The Doctor is helping.");}
}

class Surgeon extends Doctor {
    void operation(){
    }
}

class Teacher extends Employee{
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
}

class Driver extends Employee{
    String carBrand = "Mercedes";
    void drive(){
        System.out.println("The driver is driving");
    }
}

interface Help_able{
    void help();
}