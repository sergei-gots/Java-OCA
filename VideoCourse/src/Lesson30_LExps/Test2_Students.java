package Lesson30_LExps;

import java.util.ArrayList;


public class Test2_Students {
    
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        FindStudentOverGrade fsog = new FindStudentOverGrade();
        FindStudentUnderGrade fsug = new FindStudentUnderGrade();
        FindStudentOverAge fsoa = new FindStudentOverAge();
        FindStudentUnderAge fsua = new FindStudentUnderAge();
        FindStudentBySex fsbs = new FindStudentBySex();
        FindStudentMixedCondition fsmc = new FindStudentMixedCondition();
        
        si.testStudents(list, fsog);
        System.out.println("----------------------------------------");
        si.testStudents(list, fsug);
        System.out.println("----------------------------------------");
        si.testStudents(list, fsoa);
        System.out.println("----------------------------------------");
        si.testStudents(list, fsua);
        System.out.println("----------------------------------------");
        si.testStudents(list, fsbs);
        System.out.println("----------------------------------------");
        si.testStudents(list, fsmc);
        System.out.println("----------------------------------------");
        
    }
}
    
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avGrade;
    
    Student(String name, char sex, int age, int course, double avGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }
}

class StudentInfo{
    void print(Student st){
        System.out.println("Student " + st.name 
            + ", sex: " + st.sex
            + ", age: " + st.age
            + ", course: " + st.course
            + ", av.grade: " + st.avGrade);
    }
    
    void testStudents(ArrayList <Student> aL, StudentChecks sc){
        for (Student st: aL){
            if (sc.test(st)){
                print(st);
            }
        }
    }
}        

interface StudentChecks {
    boolean test(Student s);
}
    

class FindStudentOverGrade implements StudentChecks {
    public boolean test(Student s){
        return s.avGrade > 8.5;
    }
}

class FindStudentUnderGrade implements StudentChecks {
    public boolean test(Student s){
        return s.avGrade < 9;
    }
}

class FindStudentOverAge implements StudentChecks {
    public boolean test(Student s){
        return s.age > 25;
    }
}

class FindStudentUnderAge implements StudentChecks {
    public boolean test(Student s){
        return s.age < 27;
    }
}

class FindStudentBySex implements StudentChecks {
    public boolean test(Student s){
        return s.sex == 'm';
    }
}

class FindStudentMixedCondition implements StudentChecks {
    public boolean test(Student s){
        return (s.avGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}







