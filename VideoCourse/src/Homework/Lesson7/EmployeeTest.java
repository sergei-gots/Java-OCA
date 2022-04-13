 
package Homework.Lesson7;

 
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee("Gots", 400.0);
        //The next contructor has an access modifier which is private.
        //Employee emp = new Employee("Gots");
        System.out.println("ID (direct from EmployeeTest.main-method):" + emp.id + ".");
        //The access modifier for the variable salary in the class Employee
        //is private:
        //System.out.println("Salary:" + emp.salary + ".");
        System.out.println("Surname:" + emp.surname + ".");
        emp.printId();
        emp.printSurname();
        emp.printSalary();
        emp.doubleSalary();
        emp.printSalary();
    }
}
