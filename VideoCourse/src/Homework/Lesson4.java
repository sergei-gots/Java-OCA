package Homework;

public class Lesson4{
}

class Student{

    Student(int id_, String name_, String surname_){
        id = id_;
        name = name_;
        surname = surname_;
    }
    
    int id;
    String surname, 
            name;
    double gradeMath,
            gradeEconomics,
            gradeForeignLang;
}


class StudentTest {

    public static void main(String[] args){
    
        Student student1 = new Student(1, "John", "Johnson");
        Student student2 = new Student(2, "Homer", "Sympson");
        Student student3 = new Student(3, "Sergei", "Gots");
        
        
        student1.gradeEconomics = 3.0;
        student1.gradeForeignLang = 4;
        student1.gradeMath = 5;
        
        student2.gradeEconomics = 4;
        student2.gradeForeignLang = 4;
        student2.gradeMath = 5;

        student3.gradeEconomics = 5;
        student3.gradeForeignLang = 5;
        student3.gradeMath = 5;

        StudentAvGrade(student1);
        StudentAvGrade(student2);
        StudentAvGrade(student3);
        
    }
    
    static void StudentAvGrade(Student student) {
        double avGrade = (student.gradeEconomics
                    + student.gradeForeignLang
                    + student.gradeMath)/3;
        System.out.println("Student: " + student.id 
                    + ". " + student.name + " " + student.surname
                    + ".\t av.grade: " + avGrade);

    }
    
}