 
package Homework.Lesson7;

 
public class Employee {
    
    int id;
    public String surname;
    private double salary;
    
    
    public Employee (String surname_){
       this(0, surname_, 100);
    }
    
    Employee(String surname_, double salary_){
        this(0, surname_, salary_);
    }
    
    private Employee (int id_, String surname_, double salary_){
        id = id_;
        surname = surname_;
        salary = salary_;
    }
       
   
    public void doubleSalary(){
       salary*=2;
       System.out.println("New salary is " + salary);
   }
    
    public void printId(){
        System.out.println("ID:" + id + ".");
    }
       
    public void printSurname(){
        System.out.println("Surname:" + surname + ".");
    }
    
    public void printSalary(){
        System.out.println("Salary:" + salary + ".");
    }
    public static void main(String[] args) {
        //Employee emp = new Employee("Gots", 400.0);
        Employee emp = new Employee("Gots");
        System.out.println("ID (direct from Employee.main-method):" 
                + emp.id + ".");
        System.out.println("Salary(direct from Employee.main-method):" 
                + emp.salary + ".");
        System.out.println("Surname:" + emp.surname + ".");
        emp.printId();
        emp.printSurname();
        emp.printSalary();
        emp.doubleSalary();
        emp.printSalary();
    }
}



