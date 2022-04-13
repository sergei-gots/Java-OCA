
package Homework;


public class Lesson5 {
    
}


class Employee {
    int id;
    String surname;
    int age;
    double salary;
    int departmentId;
    
    Employee(int id_, String surname_, int age_, int departmentId_, double salary_){
        id = id_;
        surname = surname_;
        age = age_;
        departmentId = departmentId_;
        salary = salary_;
    }
    
    double doubleSalary(){
        salary*=2;
        return salary;
    }
}


class EmployeeTest {
    
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Snitko", 46, 0,  1100);
        Employee e2 = new Employee(2, "Gots", 45, 3, 250);
        
        doubleSalaryAndNotify(e1);
        doubleSalaryAndNotify(e2);
    }    
        
    static void doubleSalaryAndNotify(Employee e){
            System.out.println("There is a new salary for the employee " 
                    + e.surname
                    + ": " + e.doubleSalary() 
                    + "EUR.");
    }
            
}