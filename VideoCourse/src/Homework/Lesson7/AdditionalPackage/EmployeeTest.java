 
package Homework.Lesson7.AdditionalPackage;

import Homework.Lesson7.Employee;

 
class EmployeeTest{
    public static void main(String[] args) {
        //The next contructor has an access modifier which is default.
        //Employee emp = new Employee("Gots", 400.0);
        Employee emp = new Employee("Gots");
        //System.out.println("ID:" + emp.id + ".");
        //System.out.println("Salary:" + emp.salary + ".");
        System.out.println("Surname:" + emp.surname + ".");
        emp.printId();
        emp.printSurname();
        emp.printSalary();
        emp.doubleSalary();
        emp.printSalary();
       }
}