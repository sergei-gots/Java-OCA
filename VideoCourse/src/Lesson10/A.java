 
package Lesson10;


import Homework.Lesson9.Class1;
import static Lesson9.Car.*;

//import Lesson9.Car;
//import Lesson9.Student;
//or:

import Lesson9.*; 
//means import all the (public) classes of the packet "Lesson9"

//import Lesson8.*;
//but and Car, and Student are both declared in the "Lesson8" such as
//in the "Lesson9"-package.
 
public class A {
    
    //static int count = 99;
    
    public static void main(String[] args) {
        //Lesson8.Car c1 = new Lesson8.Car(); //("red", "V6");
        
        //Class "String" actually is in the package "java.lang";
        //This package is improted by default.
        java.lang.String st1 = new java.lang.String("Hello");
        
        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(st2.c);
        
        Class1 c1Instance = null;
        
        System.out.println(ab);
        System.out.println(count);
    }
}

class B {
    public B(){
        Student st3 = new Student();
    }
}
