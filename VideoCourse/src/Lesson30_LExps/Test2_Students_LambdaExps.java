package Lesson30_LExps;

import java.util.ArrayList;


public class Test2_Students_LambdaExps {
    
    public static void main(String[] args) {
        ArrayList <Student30> list = new ArrayList<>();
        Student30 st1 = new Student30("Ivan", 'm', 22, 3, 8.3);
        Student30 st2 = new Student30("Nikolay", 'm', 28, 2, 6.4);
        Student30 st3 = new Student30("Elena", 'f', 19, 1, 8.9);
        Student30 st4 = new Student30("Petr", 'm', 35, 4, 7);
        Student30 st5 = new Student30("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Student30Info si = new Student30Info();
        
                                //parameter of Interface method
                                                //body of method implementation
        si.testStudent30s(list, (Student30 st) -> {return st.avGrade>8.5;} );
        System.out.println("----------------------------------------");
        si.testStudent30s(list,   st -> st.avGrade < 9 );
        System.out.println("----------------------------------------");
        si.testStudent30s(list, (Student30 st) -> st.age>27);
        System.out.println("----------------------------------------");
        si.testStudent30s(list, st -> {return st.age<25;} );
        System.out.println("----------------------------------------");
        si.testStudent30s(list, (Student30 st) -> {return st.sex == 'm';} );
        System.out.println("----------------------------------------");
        si.testStudent30s(list, (Student30 st) -> {
                                    return (st.avGrade > 7.2 
                                            && st.age < 23 
                                            && st.sex == 'f');
                                } );
        System.out.println("----------------------------------------");
        
    }
}
    
class Student30 {
    String name;
    char sex;
    int age;
    int course;
    double avGrade;
    
    Student30(String name, char sex, int age, int course, double avGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }
}

class Student30Info{
    void print(Student30 st){
        System.out.println("Student30 " + st.name 
            + ", sex: " + st.sex
            + ", age: " + st.age
            + ", course: " + st.course
            + ", av.grade: " + st.avGrade);
    }
    
    void testStudent30s(ArrayList <Student30> aL, Student30Checks sc){
        for (Student30 st: aL){
            if (sc.test(st)){
                print(st);
            }
        }
    }
}        

//It's a FUNCTIONAL INTERFACE. i.e. interface with the only declared function.
//Only for such interfaces LAMBDA-Expressions can be used.
interface Student30Checks {
    boolean test(Student30 s);
}
   


