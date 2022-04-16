package Lesson30_LExps;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test3_StudentsIPredicate {
    
    public static void main(String[] args) {
        ArrayList <StudentPredicated> list = new ArrayList<>();
        StudentPredicated st1 = new StudentPredicated("Ivan", 'm', 22, 3, 8.3);
        StudentPredicated st2 = new StudentPredicated("Nikolay", 'm', 28, 2, 6.4);
        StudentPredicated st3 = new StudentPredicated("Elena", 'f', 19, 1, 8.9);
        StudentPredicated st4 = new StudentPredicated("Petr", 'm', 35, 4, 7);
        StudentPredicated st5 = new StudentPredicated("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentPredicatedInfo si = new StudentPredicatedInfo();
        
        for (StudentPredicated s: list) {
            System.out.println("s.name = " + s.name);
        }
        System.out.println("-------------------------------------");
        
        list.removeIf(x->x.name.endsWith("a"));
        for (StudentPredicated s: list) {
            System.out.println("s.name = " + s.name);
        }
        System.out.println("-------------------------------------");
        
        
        
        si.testStudentPredicateds(list, (StudentPredicated st) -> {return st.avGrade>8.5;} );
        System.out.println("----------------------------------------");
        si.testStudentPredicateds(list,   st -> st.avGrade < 9 );
        System.out.println("----------------------------------------");
        si.testStudentPredicateds(list, (StudentPredicated st) -> st.age>27);
        System.out.println("----------------------------------------");
        si.testStudentPredicateds(list, st -> {return st.age<25;} );
        System.out.println("----------------------------------------");
        si.testStudentPredicateds(list, (StudentPredicated st) -> {return st.sex == 'm';} );
        System.out.println("----------------------------------------");
        si.testStudentPredicateds(list, (StudentPredicated st) -> {
                                    return (st.avGrade > 7.2 
                                            && st.age < 23 
                                            && st.sex == 'f');
                                } );
        System.out.println("----------------------------------------");
        
    }
}
    
class StudentPredicated {
    String name;
    char sex;
    int age;
    int course;
    double avGrade;
    
    StudentPredicated(String name, char sex, int age, int course, double avGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }
}

class StudentPredicatedInfo{
    void print(StudentPredicated st){
        System.out.println("StudentPredicated " + st.name 
            + ", sex: " + st.sex
            + ", age: " + st.age
            + ", course: " + st.course
            + ", av.grade: " + st.avGrade);
    }
    
    void testStudentPredicateds(ArrayList <StudentPredicated> aL, Predicate<StudentPredicated> t){
        for (StudentPredicated st: aL){
            if (t.test(st)){
                print(st);
            }
        }
    }
}        

    







