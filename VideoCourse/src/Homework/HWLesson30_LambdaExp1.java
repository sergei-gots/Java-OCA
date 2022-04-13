 
package Homework;

import java.util.function.Predicate;
import java.util.ArrayList;
 
public class HWLesson30_LambdaExp1 {
    
}


class Employee {
    String name;
    String department;
    double salary;
    
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}


class TestEmployee {
    
    ArrayList <Employee> alEmployees = new ArrayList<>();
    
    void print(Employee e) {
        System.out.println("Employe " + e.name
                            + ", department: " + e.department
                            + ", salary: " + e.salary + ".");
    }
    
    void filter(Predicate<Employee> p){
        for(Employee e: alEmployees) {
           if(p.test(e)) {
               print(e);
           }
        }
        System.out.println("-------------------------------------------------");
    
    }
    
    public static void main(String[] args) {
        TestEmployee test = new TestEmployee ();
        test.alEmployees.add(new Employee("Johnson", "Johnson", 200.0));
        test.alEmployees.add(new Employee("Petersen", "Johnson", 450.0));
        test.alEmployees.add(new Employee("Nilsen", "Johnson", 350.0));
        test.alEmployees.add(new Employee("Ericson", "Johnson", 300.0));
        
        System.out.println("Filter#1: salary>200");
        test.filter(e -> e.salary>200);
        System.out.println("Filter#2: salary!=450 and name doesn't begin with 'E'");
        test.filter(e -> e.salary!=450 && !e.name.startsWith("E"));
        System.out.println("Filter#2: the name is the same as the department");
        test.filter(e -> e.name.equals(e.department));
    }
}