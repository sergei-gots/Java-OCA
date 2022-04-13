 
package Lesson7;

 
public class Employee {
    public double salary;
   
    public Employee (double salary_){
       salary = salary_;
   }
   
    public void doubleSalary(){
       salary*=2;
       System.out.println("New salary is " + salary);
   }
   
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}
