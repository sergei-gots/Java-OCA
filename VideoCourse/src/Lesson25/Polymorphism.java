 
package Lesson25;

//Overrided methods are polymorphic too

public class Polymorphism {
    public static void main(String[] args) {
        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Teacher(), new Doctor()};
        Help_able [] array3 = {new Driver(), new Doctor()};
        
        
        
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        
        Employee [] array = { emp1, emp2, emp3 };
        for(Employee emp:array2){
            emp.work();
        }
        System.out.println();
        
        Help_able h = new Teacher();
        h.help();
        emp2.help();
        emp1.work();
        emp2.work();
        emp3.work();
        
        System.out.println();
        System.out.println("emp1 instanceof Teacher = " + (emp1 instanceof Teacher));
        System.out.println("emp1 instanceof Help_able = " + (emp1 instanceof Help_able));
        System.out.println("emp1 instanceof Employee = " + (emp1 instanceof Employee));
        System.out.println("emp1 instanceof Driver = " + (emp1 instanceof Driver));
        
        String s1 = null;
        System.out.println("s1 instanceof String = " + (s1 instanceof String));
        System.out.println("array1 instanceof Object = " + (array1 instanceof Object));
        
        
    }
}

abstract class Employee implements Help_able{
    void sleep(){System.out.println("The employee is sleeping.");}
    public void help(){System.out.println("The Employee is helping.");}
    abstract void work();
}

class Teacher extends Employee implements Help_able{
    void work(){
        System.out.println("The teacher is working.");
    }
    public void help(){System.out.println("The teacher is helping.");}
}

class Driver extends Employee{
    void work(){
        System.out.println("The driver is working.");
    }
}

class Doctor extends Employee{
    void work(){
        System.out.println("The doctor is working.");
    }
}


interface Help_able{
    void help();
}