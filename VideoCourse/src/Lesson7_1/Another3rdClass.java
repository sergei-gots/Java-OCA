 
package Lesson7_1;

import Lesson7.Employee;

 
public class Another3rdClass {
    public static void main(String[] args) {
        Lesson7.Employee emp = new Lesson7.Employee(500);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}
