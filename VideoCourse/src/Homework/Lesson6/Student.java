package Homework.Lesson6;


public class Student{

    int id;
    String surname, 
            name;
    int course;
    double gradeMath,
            gradeEconomics,
            gradeForeignLang;
    
    
    Student(int id_, String name_, String surname_, int course_){
        id = id_;
        name = name_;
        surname = surname_;
        course = course_;
    }
    
    Student(int id_, String name_, String surname_){
        this(id_, name_, surname_, 0);
    }
    
    Student(){}
}


class StudentTest {

    public static void main(String[] args){
    
        Student student0 = new Student();
        Student student1 = new Student(1, "John", "Johnson");
        Student student2 = new Student(2, "Homer", "Sympson");
        Student student3 = new Student(3, "Sergei", "Gots", 5);
        
        
        student1.gradeEconomics = 3.0;
        student1.gradeForeignLang = 4;
        student1.gradeMath = 5;
        
        student2.gradeEconomics = 4;
        student2.gradeForeignLang = 4;
        student2.gradeMath = 5;

        student3.gradeEconomics = 5;
        student3.gradeForeignLang = 5;
        student3.gradeMath = 5;

        StudentAvGrade(student0);
        StudentAvGrade(student1);
        StudentAvGrade(student2);
        StudentAvGrade(student3);
        
    }
    
    static void StudentAvGrade(Student student) {
        double avGrade = (student.gradeEconomics
                    + student.gradeForeignLang
                    + student.gradeMath)/3;
        System.out.println("Student: " + student.id 
                    + ". Course: " + student.course + " " 
                    + ". " + student.name + " " + student.surname
                    + ".\t av.grade: " + avGrade);

    }
    
}