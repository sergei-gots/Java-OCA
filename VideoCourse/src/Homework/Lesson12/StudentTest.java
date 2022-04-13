 
package Homework.Lesson12;

import Lesson11.Student;

public class StudentTest {
    static void areEqual(Student st1, Student st2) {
        if(st1.name.equals(st2.name) 
                && (st1.course==st2.course) 
                && (st1.grade==st2.grade)){
            System.out.println("Method \"areEqual\": students are equal.");
        }
        else {
            System.out.println("Method \"areEqual\": students are not equal.");
        }
    }
    
    static void compare(Student st1, Student st2) {
        if(st1.name.equals(st2.name)) {
            if(st1.course==st2.course){
                if((st1.grade==st2.grade)) {
                    System.out.println("Students are equal.");
                }
                else {
                    System.out.println("Students differ by grades: " + st1.grade 
                    + " vs " + st2.grade + ".");
                }
            }
            else {
                System.out.println("Students differ by courses: " + st1.course 
                    + " vs " + st2.course + ".");
            }
        }
        else {
            System.out.println("Students differ by names: " + st1.name 
                    + " vs " + st2.name + ".");
        }   
    }
    
    static void compareThoroughly(Student st1, Student st2){
        areEqual(st1, st2);
        compare(st1, st2);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1, 3.4);
        Student st2 = new Student("Ivan", 1, 4.9);
        Student st3 = new Student("Ivan", 1, 4.9);
        Student st4 = new Student("John", 1, 4.9);
        Student st5 = new Student("Ivan", 2, 4.9);
        Student st6 = new Student("Ivan", 1, 5.0);
        
        compareThoroughly(st1, st2);
        compareThoroughly(st2, st2);
        compareThoroughly(st2, st3);
        compareThoroughly(st2, st4);
        compareThoroughly(st2, st5);
        compareThoroughly(st2, st6);
        
    }

    
    
}
