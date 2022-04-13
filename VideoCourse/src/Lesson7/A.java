//Package STATEMENT 
//without this statement the classes in this file will be defined 
//in a "default" packeage and cannot be accessed from anywere else.
//Package should be defined. Not to define a package is a bad praxis. 
package Lesson7;

//Class STATEMENT 
public class A {
    public static void main(String[] args) {
        //Class B in the same package Lesson7 is visible within class A
        B object = new B();
        //without import or FULL NAME of the CLASS compiler doesn't find the class Employee
        //Constructor must be declared as PUBLIC
        //Employee emp = new Employee();
        Lesson6.Employee emp = new Lesson6.Employee("Gots", 45);
     //System.out.println("Privet vsem!!!!!");
    }
}
